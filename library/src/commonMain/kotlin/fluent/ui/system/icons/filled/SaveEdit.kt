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

public val FluentIcons.Filled.SaveEdit: ImageVector
    get() {
        if (_SaveEdit != null) {
            return _SaveEdit!!
        }
        _SaveEdit = ImageVector.Builder(
            name = "Filled.SaveEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 3f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                curveTo(6f, 13.757f, 7.007f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(15.603f)
                lineTo(17.391f, 10.962f)
                curveTo(18.032f, 10.321f, 18.874f, 10f, 19.713f, 10f)
                horizontalLineTo(19.715f)
                curveTo(20.152f, 10f, 20.59f, 10.087f, 21f, 10.262f)
                verticalLineTo(8.286f)
                curveTo(21f, 7.424f, 20.658f, 6.597f, 20.048f, 5.987f)
                lineTo(18.013f, 3.952f)
                curveTo(17.411f, 3.351f, 16.599f, 3.009f, 15.75f, 3f)
                verticalLineTo(7.5f)
                curveTo(15.75f, 8.743f, 14.743f, 9.75f, 13.5f, 9.75f)
                horizontalLineTo(9f)
                curveTo(7.757f, 9.75f, 6.75f, 8.743f, 6.75f, 7.5f)
                verticalLineTo(3f)
                close()
                moveTo(14.103f, 14.25f)
                lineTo(11.488f, 16.865f)
                curveTo(11.016f, 17.337f, 10.681f, 17.929f, 10.519f, 18.577f)
                lineTo(10.061f, 20.407f)
                curveTo(10.011f, 20.609f, 9.991f, 20.808f, 9.999f, 21f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                curveTo(7.5f, 14.586f, 7.836f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(14.103f)
                close()
                moveTo(14.25f, 3f)
                verticalLineTo(7.5f)
                curveTo(14.25f, 7.914f, 13.914f, 8.25f, 13.5f, 8.25f)
                horizontalLineTo(9f)
                curveTo(8.586f, 8.25f, 8.25f, 7.914f, 8.25f, 7.5f)
                verticalLineTo(3f)
                horizontalLineTo(14.25f)
                close()
                moveTo(19.715f, 11f)
                horizontalLineTo(19.713f)
                curveTo(19.128f, 11f, 18.544f, 11.223f, 18.098f, 11.67f)
                lineTo(12.196f, 17.572f)
                curveTo(11.851f, 17.916f, 11.607f, 18.347f, 11.489f, 18.819f)
                lineTo(11.031f, 20.65f)
                curveTo(10.833f, 21.446f, 11.554f, 22.167f, 12.35f, 21.968f)
                lineTo(14.18f, 21.511f)
                curveTo(14.653f, 21.393f, 15.084f, 21.149f, 15.428f, 20.804f)
                lineTo(21.33f, 14.902f)
                curveTo(22.223f, 14.009f, 22.223f, 12.562f, 21.33f, 11.67f)
                curveTo(20.884f, 11.223f, 20.3f, 11f, 19.715f, 11f)
                close()
            }
        }.build()

        return _SaveEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SaveEdit: ImageVector? = null

@Preview
@Composable
private fun SaveEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SaveEdit, contentDescription = null)
    }
}
