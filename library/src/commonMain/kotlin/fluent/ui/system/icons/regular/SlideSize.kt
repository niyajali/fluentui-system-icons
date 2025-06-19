package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.SlideSize: ImageVector
    get() {
        if (_SlideSize != null) {
            return _SlideSize!!
        }
        _SlideSize = ImageVector.Builder(
            name = "Regular.SlideSize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.781f, 7.22f)
                curveTo(16.921f, 7.36f, 17f, 7.551f, 17f, 7.75f)
                verticalLineTo(10.25f)
                curveTo(17f, 10.664f, 16.665f, 11f, 16.25f, 11f)
                curveTo(15.836f, 11f, 15.5f, 10.664f, 15.5f, 10.25f)
                verticalLineTo(9.56f)
                lineTo(13.78f, 11.28f)
                curveTo(13.487f, 11.573f, 13.012f, 11.573f, 12.719f, 11.28f)
                curveTo(12.427f, 10.987f, 12.427f, 10.512f, 12.72f, 10.219f)
                lineTo(14.439f, 8.5f)
                horizontalLineTo(13.749f)
                curveTo(13.335f, 8.5f, 12.999f, 8.164f, 12.999f, 7.75f)
                curveTo(12.999f, 7.336f, 13.335f, 7f, 13.749f, 7f)
                lineTo(16.25f, 7f)
                curveTo(16.449f, 7f, 16.64f, 7.079f, 16.781f, 7.22f)
                close()
                moveTo(7f, 16.25f)
                curveTo(7f, 16.449f, 7.079f, 16.64f, 7.22f, 16.78f)
                curveTo(7.36f, 16.921f, 7.551f, 17f, 7.75f, 17f)
                horizontalLineTo(10.251f)
                curveTo(10.665f, 17f, 11.001f, 16.664f, 11.001f, 16.25f)
                curveTo(11.001f, 15.836f, 10.665f, 15.5f, 10.251f, 15.5f)
                horizontalLineTo(9.56f)
                lineTo(11.28f, 13.78f)
                curveTo(11.573f, 13.487f, 11.573f, 13.012f, 11.28f, 12.719f)
                curveTo(10.987f, 12.426f, 10.512f, 12.426f, 10.22f, 12.719f)
                lineTo(8.5f, 14.439f)
                verticalLineTo(13.75f)
                curveTo(8.5f, 13.336f, 8.164f, 13f, 7.75f, 13f)
                curveTo(7.336f, 13f, 7f, 13.336f, 7f, 13.75f)
                lineTo(7f, 16.25f)
                close()
                moveTo(2f, 6.75f)
                curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(4.75f, 5.5f)
                curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(3.5f, 17.94f, 4.06f, 18.5f, 4.75f, 18.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 18.5f, 20.5f, 17.94f, 20.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()

        return _SlideSize!!
    }

@Suppress("ObjectPropertyName")
private var _SlideSize: ImageVector? = null

@Preview
@Composable
private fun SlideSizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideSize, contentDescription = null)
    }
}
