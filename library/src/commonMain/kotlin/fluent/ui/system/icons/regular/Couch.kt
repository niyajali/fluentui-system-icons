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

public val FluentIcons.Regular.Couch: ImageVector
    get() {
        if (_Couch != null) {
            return _Couch!!
        }
        _Couch = ImageVector.Builder(
            name = "Regular.Couch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.25f, 4f)
                curveTo(5.731f, 4f, 4.5f, 5.231f, 4.5f, 6.75f)
                verticalLineTo(8.087f)
                curveTo(3.067f, 8.426f, 2f, 9.713f, 2f, 11.25f)
                verticalLineTo(14.25f)
                curveTo(2f, 15.684f, 3.098f, 16.862f, 4.5f, 16.989f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.664f, 4.836f, 19f, 5.25f, 19f)
                curveTo(5.664f, 19f, 6f, 18.664f, 6f, 18.25f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(18.25f)
                curveTo(18f, 18.664f, 18.336f, 19f, 18.75f, 19f)
                curveTo(19.164f, 19f, 19.5f, 18.664f, 19.5f, 18.25f)
                verticalLineTo(16.989f)
                curveTo(20.902f, 16.862f, 22f, 15.684f, 22f, 14.25f)
                verticalLineTo(11.25f)
                curveTo(22f, 9.713f, 20.933f, 8.426f, 19.5f, 8.087f)
                verticalLineTo(6.75f)
                curveTo(19.5f, 5.231f, 18.269f, 4f, 16.75f, 4f)
                horizontalLineTo(7.25f)
                close()
                moveTo(19.25f, 15.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 15.5f, 3.5f, 14.94f, 3.5f, 14.25f)
                verticalLineTo(11.25f)
                curveTo(3.5f, 10.283f, 4.284f, 9.5f, 5.25f, 9.5f)
                curveTo(6.216f, 9.5f, 7f, 10.283f, 7f, 11.25f)
                verticalLineTo(11.75f)
                curveTo(7f, 12.164f, 7.336f, 12.5f, 7.75f, 12.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.5f, 17f, 12.164f, 17f, 11.75f)
                verticalLineTo(11.25f)
                curveTo(17f, 10.283f, 17.784f, 9.5f, 18.75f, 9.5f)
                curveTo(19.716f, 9.5f, 20.5f, 10.283f, 20.5f, 11.25f)
                verticalLineTo(14.25f)
                curveTo(20.5f, 14.94f, 19.94f, 15.5f, 19.25f, 15.5f)
                close()
                moveTo(18f, 8.087f)
                curveTo(16.645f, 8.407f, 15.618f, 9.575f, 15.509f, 11f)
                horizontalLineTo(8.491f)
                curveTo(8.382f, 9.575f, 7.355f, 8.407f, 6f, 8.087f)
                verticalLineTo(6.75f)
                curveTo(6f, 6.06f, 6.56f, 5.5f, 7.25f, 5.5f)
                horizontalLineTo(16.75f)
                curveTo(17.44f, 5.5f, 18f, 6.06f, 18f, 6.75f)
                verticalLineTo(8.087f)
                close()
            }
        }.build()

        return _Couch!!
    }

@Suppress("ObjectPropertyName")
private var _Couch: ImageVector? = null

@Preview
@Composable
private fun CouchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Couch, contentDescription = null)
    }
}
