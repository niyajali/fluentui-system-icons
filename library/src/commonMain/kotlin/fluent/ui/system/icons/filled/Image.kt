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

public val FluentIcons.Filled.Image: ImageVector
    get() {
        if (_Image != null) {
            return _Image!!
        }
        _Image = ImageVector.Builder(
            name = "Filled.Image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.558f, 13.647f)
                lineTo(11.475f, 13.718f)
                lineTo(4.547f, 20.519f)
                curveTo(5.042f, 20.824f, 5.626f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(18.375f, 21f, 18.958f, 20.824f, 19.453f, 20.519f)
                lineTo(12.525f, 13.718f)
                lineTo(12.432f, 13.64f)
                curveTo(12.17f, 13.455f, 11.817f, 13.458f, 11.558f, 13.647f)
                close()
                moveTo(21f, 6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 18.377f, 3.178f, 18.963f, 3.485f, 19.459f)
                lineTo(10.424f, 12.648f)
                lineTo(10.559f, 12.525f)
                curveTo(11.394f, 11.827f, 12.615f, 11.829f, 13.448f, 12.531f)
                lineTo(13.576f, 12.648f)
                lineTo(20.515f, 19.459f)
                curveTo(20.822f, 18.963f, 21f, 18.377f, 21f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(15.25f, 10.75f)
                curveTo(14.145f, 10.75f, 13.25f, 9.855f, 13.25f, 8.75f)
                curveTo(13.25f, 7.645f, 14.145f, 6.75f, 15.25f, 6.75f)
                curveTo(16.355f, 6.75f, 17.25f, 7.645f, 17.25f, 8.75f)
                curveTo(17.25f, 9.855f, 16.355f, 10.75f, 15.25f, 10.75f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null

@Preview
@Composable
private fun ImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Image, contentDescription = null)
    }
}
