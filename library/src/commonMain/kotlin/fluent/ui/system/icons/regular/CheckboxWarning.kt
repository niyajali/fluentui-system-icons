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

public val FluentIcons.Regular.CheckboxWarning: ImageVector
    get() {
        if (_CheckboxWarning != null) {
            return _CheckboxWarning!!
        }
        _CheckboxWarning = ImageVector.Builder(
            name = "Regular.CheckboxWarning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(11.054f)
                curveTo(11.097f, 20.792f, 11.168f, 20.584f, 11.27f, 20.381f)
                lineTo(11.71f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(11.992f)
                curveTo(19.589f, 12.111f, 19.67f, 12.242f, 19.74f, 12.383f)
                lineTo(21f, 14.905f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.28f, 9.281f)
                curveTo(17.573f, 8.988f, 17.573f, 8.513f, 17.281f, 8.22f)
                curveTo(16.988f, 7.927f, 16.513f, 7.927f, 16.22f, 8.219f)
                lineTo(9.997f, 14.436f)
                lineTo(7.781f, 12.22f)
                curveTo(7.488f, 11.927f, 7.013f, 11.927f, 6.72f, 12.22f)
                curveTo(6.427f, 12.512f, 6.427f, 12.987f, 6.72f, 13.28f)
                lineTo(9.466f, 16.026f)
                curveTo(9.759f, 16.319f, 10.233f, 16.319f, 10.526f, 16.027f)
                lineTo(17.28f, 9.281f)
                close()
                moveTo(16.162f, 12.83f)
                lineTo(12.165f, 20.828f)
                curveTo(11.666f, 21.826f, 12.392f, 23f, 13.507f, 23f)
                horizontalLineTo(21.501f)
                curveTo(22.617f, 23f, 23.343f, 21.826f, 22.844f, 20.828f)
                lineTo(18.847f, 12.83f)
                curveTo(18.294f, 11.723f, 16.715f, 11.723f, 16.162f, 12.83f)
                close()
                moveTo(18.005f, 15.496f)
                verticalLineTo(18.497f)
                curveTo(18.005f, 18.774f, 17.781f, 18.998f, 17.504f, 18.998f)
                curveTo(17.228f, 18.998f, 17.004f, 18.774f, 17.004f, 18.497f)
                verticalLineTo(15.496f)
                curveTo(17.004f, 15.219f, 17.228f, 14.995f, 17.504f, 14.995f)
                curveTo(17.781f, 14.995f, 18.005f, 15.219f, 18.005f, 15.496f)
                close()
                moveTo(17.504f, 20.999f)
                curveTo(17.228f, 20.999f, 17.004f, 20.775f, 17.004f, 20.499f)
                curveTo(17.004f, 20.222f, 17.228f, 19.998f, 17.504f, 19.998f)
                curveTo(17.781f, 19.998f, 18.005f, 20.222f, 18.005f, 20.499f)
                curveTo(18.005f, 20.775f, 17.781f, 20.999f, 17.504f, 20.999f)
                close()
            }
        }.build()

        return _CheckboxWarning!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxWarning: ImageVector? = null

@Preview
@Composable
private fun CheckboxWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CheckboxWarning, contentDescription = null)
    }
}
