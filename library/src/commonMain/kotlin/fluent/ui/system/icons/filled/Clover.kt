package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.Clover: ImageVector
    get() {
        if (_Clover != null) {
            return _Clover!!
        }
        _Clover = ImageVector.Builder(
            name = "Filled.Clover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 2f)
                curveTo(4.127f, 2f, 2f, 4.127f, 2f, 6.75f)
                curveTo(2f, 9.373f, 4.127f, 11.5f, 6.75f, 11.5f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 11.5f, 11.5f, 11.164f, 11.5f, 10.75f)
                verticalLineTo(6.75f)
                curveTo(11.5f, 4.127f, 9.373f, 2f, 6.75f, 2f)
                close()
                moveTo(6.75f, 22f)
                curveTo(4.127f, 22f, 2f, 19.873f, 2f, 17.25f)
                curveTo(2f, 14.627f, 4.127f, 12.5f, 6.75f, 12.5f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 12.5f, 11.5f, 12.836f, 11.5f, 13.25f)
                verticalLineTo(17.25f)
                curveTo(11.5f, 19.873f, 9.373f, 22f, 6.75f, 22f)
                close()
                moveTo(17.25f, 2f)
                curveTo(19.873f, 2f, 22f, 4.127f, 22f, 6.75f)
                curveTo(22f, 9.373f, 19.873f, 11.5f, 17.25f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 11.5f, 12.5f, 11.164f, 12.5f, 10.75f)
                verticalLineTo(6.75f)
                curveTo(12.5f, 4.127f, 14.627f, 2f, 17.25f, 2f)
                close()
                moveTo(17.25f, 22f)
                curveTo(19.873f, 22f, 22f, 19.873f, 22f, 17.25f)
                curveTo(22f, 14.627f, 19.873f, 12.5f, 17.25f, 12.5f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 12.5f, 12.5f, 12.836f, 12.5f, 13.25f)
                verticalLineTo(17.25f)
                curveTo(12.5f, 19.873f, 14.627f, 22f, 17.25f, 22f)
                close()
            }
        }.build()

        return _Clover!!
    }

@Suppress("ObjectPropertyName")
private var _Clover: ImageVector? = null

@Preview
@Composable
private fun CloverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Clover, contentDescription = null)
    }
}
