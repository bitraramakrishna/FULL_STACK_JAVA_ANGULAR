enum HttpStatusCode {
  OK = 200,
  NotFound = 404,
  AccessDenied = 403,
  InternalError = 500,
}

let success: HttpStatusCode = HttpStatusCode.OK;
let notFoundError: HttpStatusCode = HttpStatusCode.NotFound;
let accessError: HttpStatusCode = HttpStatusCode.AccessDenied;

console.log(`Success Code: ${success}`);
console.log(`Not Found Code: ${notFoundError}`);
console.log(`Access Denied Code: ${accessError}`);
