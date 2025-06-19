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

public val FluentIcons.Regular.AutoFitWidth: ImageVector
    get() {
        if (_AutoFitWidth != null) {
            return _AutoFitWidth!!
        }
        _AutoFitWidth = ImageVector.Builder(
            name = "Regular.AutoFitWidth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 18.25f)
                curveTo(3f, 18.664f, 3.336f, 19f, 3.75f, 19f)
                curveTo(4.164f, 19f, 4.5f, 18.664f, 4.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.336f, 4.164f, 5f, 3.75f, 5f)
                curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(19.5f, 18.25f)
                curveTo(19.5f, 18.664f, 19.836f, 19f, 20.25f, 19f)
                curveTo(20.664f, 19f, 21f, 18.664f, 21f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
                curveTo(19.836f, 5f, 19.5f, 5.336f, 19.5f, 5.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(14.146f, 14.054f)
                curveTo(13.928f, 14.347f, 13.953f, 14.764f, 14.219f, 15.03f)
                curveTo(14.512f, 15.323f, 14.987f, 15.323f, 15.28f, 15.03f)
                lineTo(17.65f, 12.663f)
                curveTo(17.858f, 12.537f, 18f, 12.287f, 18f, 11.999f)
                curveTo(18f, 11.711f, 17.858f, 11.461f, 17.649f, 11.335f)
                lineTo(15.28f, 8.968f)
                lineTo(15.195f, 8.895f)
                curveTo(14.902f, 8.677f, 14.485f, 8.702f, 14.219f, 8.968f)
                lineTo(14.146f, 9.052f)
                curveTo(13.928f, 9.346f, 13.953f, 9.762f, 14.219f, 10.028f)
                lineTo(15.44f, 11.25f)
                horizontalLineTo(11.656f)
                lineTo(11.631f, 11.252f)
                horizontalLineTo(8.56f)
                lineTo(9.781f, 10.03f)
                lineTo(9.861f, 9.936f)
                curveTo(10.05f, 9.673f, 10.047f, 9.315f, 9.854f, 9.054f)
                lineTo(9.781f, 8.97f)
                lineTo(9.687f, 8.89f)
                curveTo(9.424f, 8.701f, 9.066f, 8.703f, 8.805f, 8.897f)
                lineTo(8.72f, 8.97f)
                lineTo(6.351f, 11.337f)
                lineTo(6.276f, 11.39f)
                curveTo(6.109f, 11.526f, 6f, 11.749f, 6f, 12.001f)
                curveTo(6f, 12.289f, 6.142f, 12.539f, 6.35f, 12.665f)
                lineTo(8.72f, 15.032f)
                lineTo(8.805f, 15.105f)
                curveTo(9.098f, 15.323f, 9.515f, 15.298f, 9.781f, 15.032f)
                curveTo(10.047f, 14.766f, 10.072f, 14.349f, 9.854f, 14.056f)
                lineTo(9.781f, 13.971f)
                lineTo(8.56f, 12.752f)
                horizontalLineTo(12.344f)
                lineTo(12.369f, 12.75f)
                horizontalLineTo(15.44f)
                lineTo(14.219f, 13.969f)
                lineTo(14.146f, 14.054f)
                close()
            }
        }.build()

        return _AutoFitWidth!!
    }

@Suppress("ObjectPropertyName")
private var _AutoFitWidth: ImageVector? = null

@Preview
@Composable
private fun AutoFitWidthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AutoFitWidth, contentDescription = null)
    }
}
