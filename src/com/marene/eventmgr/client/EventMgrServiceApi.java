package com.marene.eventmgr.client;

import java.util.Collection;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

import com.marene.eventmgr.model.Event;
import com.marene.eventmgr.model.Group;
import com.marene.eventmgr.model.LimitedEvent;
import com.marene.eventmgr.model.LimitedUser;
import com.marene.eventmgr.model.Option;
import com.marene.eventmgr.model.User;
import com.marene.eventmgr.model.UserNumber;

/**
 * This interface defines the API for the Event Management service. The
 * interface is used to provide a contract for client/server interactions. The
 * interface is annotated with Retrofit annotations so that clients can
 * automatically convert the interface into a client object. See
 * EventMgrClientApiTest for an example of how Retrofit is used to turn this
 * interface into a client.
 * 
 * @author marene
 * 
 */

public interface EventMgrServiceApi {
	public static final String SERVER_URL = "http://noddypay.com/api/v1";

	public static final String NEW_USER_PATH = "/users";
	public static final String ACTIVATE_ACCT_PATH = "/account/activate";
	public static final String AuTHENTICATE_USER_PATH = "/account/auth";

	public static final String USER_DETAILS_PATH = "/user";
	public static final String USER_EVENTS_PATH = "/user/events";
	public static final String USER_GROUPS_PATH = "/user/groups";

	public static final String NEW_EVENT_PATH = "/events";
	public static final String NEW_GROUP_PATH = "/groups/";
	public static final String FEEDBACK_PATH = "/feedbacks";

	public static final String PHOTO_PARAMETER = "photo";
	public static final String USER_AVATAR_PARAMETER = "avatar";

	// Sends a request to register a new user
	@POST(NEW_USER_PATH)
	public LimitedUser registerNewUser(@Body String phoneNumber,
			@Body String password);

	// Sends a request to activate a newly registered
	@POST(ACTIVATE_ACCT_PATH)
	public boolean activateAccount(@Body String phonenumber,
			@Body String password, @Body int verificationCode);

	// Retrieves a session token for the user with the given credentials
	// This token should be passed in all subsequent requests which require
	// authorization
	@GET(AuTHENTICATE_USER_PATH)
	public String authenticateUser(@Body String phoneNumber,
			@Body String password);

	// Retrieves the details for the current authenticated user
	@GET(USER_DETAILS_PATH)
	public User getUserDetails(@Body String userToken);

	// Updates the details for the current authenticated user
	@Multipart
	@PUT(USER_DETAILS_PATH)
	public User setUserDetails(String userToken, @Body String newFirstName,
			@Part(USER_AVATAR_PARAMETER) TypedFile avatar);

	// Retrieves a list of events for the current authenticated user
	@GET(USER_EVENTS_PATH)
	public Collection<Event> getUserEvents(String userToken);

	// Retrieves a list of groups for the current authenticated user
	@GET(USER_GROUPS_PATH)
	public Collection<Group> getUserGroups(String userToken);

	// Creates a new group for the current authenticated user
	@POST(NEW_GROUP_PATH)
	public Group createNewGroup(@Body String userToken, @Body String groupName,
			@Part(PHOTO_PARAMETER) TypedFile groupPhoto,
			@Body Collection<UserNumber> memberPhoneNumbers);

	// Creates a new event for the current authenticated user
	@POST(NEW_EVENT_PATH)
	public LimitedEvent createNewEvent(@Body String userToken,
			@Body Collection<Option> eventOptions,
			@Body Collection<UserNumber> eventInvitees,
			@Body String eventDescription);

}
