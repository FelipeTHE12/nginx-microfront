

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.rejectIfNoRule = false
grails.plugin.springsecurity.fii.rejectPublicInvocations = true
grails.plugin.springsecurity.userLookup.userDomainClassName = 'legacy.mpa.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'legacy.mpa.UserRole'
grails.plugin.springsecurity.authority.className = 'legacy.mpa.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/react',          access: ['permitAll']],
	[pattern: '/react/**',          access: ['permitAll']],
	[pattern: '/static',          access: ['permitAll']],
	[pattern: '/static/js',          access: ['permitAll']],
	[pattern: '/static/js/',          access: ['permitAll']],
	[pattern: '/static/js/bundle.js',          access: ['permitAll']],
	[pattern: '/static/js/bundle.js/',          access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

