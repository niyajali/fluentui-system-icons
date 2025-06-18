package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.Feed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Feed",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 21f)
            curveTo(15.941f, 20.994f, 16.749f, 20.327f, 16.934f, 19.403f)
            lineTo(17.415f, 17f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 17f, 22f, 16.216f, 22f, 15.25f)
            verticalLineTo(9.261f)
            curveTo(22f, 8.016f, 20.994f, 7.006f, 19.75f, 7f)
            verticalLineTo(6.996f)
            horizontalLineTo(14.5f)
            verticalLineTo(5.25f)
            curveTo(14.5f, 4.007f, 13.493f, 3f, 12.25f, 3f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 3f, 2f, 4.007f, 2f, 5.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(14.986f)
            lineTo(15f, 21f)
            close()
            moveTo(17.522f, 8.818f)
            lineTo(15.463f, 19.109f)
            curveTo(15.418f, 19.336f, 15.218f, 19.5f, 14.986f, 19.5f)
            curveTo(14.718f, 19.5f, 14.5f, 19.282f, 14.5f, 19.014f)
            verticalLineTo(8.496f)
            horizontalLineTo(17.611f)
            curveTo(17.574f, 8.6f, 17.544f, 8.707f, 17.522f, 8.818f)
            close()
            moveTo(5.778f, 8.5f)
            curveTo(5.364f, 8.5f, 5.028f, 8.164f, 5.028f, 7.75f)
            curveTo(5.028f, 7.336f, 5.364f, 7f, 5.778f, 7f)
            curveTo(6.193f, 7f, 6.528f, 7.336f, 6.528f, 7.75f)
            curveTo(6.528f, 8.164f, 6.193f, 8.5f, 5.778f, 8.5f)
            close()
            moveTo(5.031f, 15.75f)
            curveTo(5.031f, 15.336f, 5.367f, 15f, 5.781f, 15f)
            horizontalLineTo(10.781f)
            curveTo(11.196f, 15f, 11.531f, 15.336f, 11.531f, 15.75f)
            curveTo(11.531f, 16.164f, 11.196f, 16.5f, 10.781f, 16.5f)
            horizontalLineTo(5.781f)
            curveTo(5.367f, 16.5f, 5.031f, 16.164f, 5.031f, 15.75f)
            close()
            moveTo(5.781f, 11f)
            horizontalLineTo(10.781f)
            curveTo(11.196f, 11f, 11.531f, 11.336f, 11.531f, 11.75f)
            curveTo(11.531f, 12.164f, 11.196f, 12.5f, 10.781f, 12.5f)
            horizontalLineTo(5.781f)
            curveTo(5.367f, 12.5f, 5.031f, 12.164f, 5.031f, 11.75f)
            curveTo(5.031f, 11.336f, 5.367f, 11f, 5.781f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FeedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Feed, contentDescription = null)
    }
}
