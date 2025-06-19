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

public val FluentIcons.Regular.ShiftsAdd: ImageVector
    get() {
        if (_ShiftsAdd != null) {
            return _ShiftsAdd!!
        }
        _ShiftsAdd = ImageVector.Builder(
            name = "Regular.ShiftsAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(12.686f)
                curveTo(12.514f, 20.034f, 12.275f, 20.537f, 11.978f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(12.022f)
                curveTo(3.463f, 11.725f, 3.967f, 11.486f, 4.5f, 11.314f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                close()
                moveTo(7.001f, 20.503f)
                lineTo(7.001f, 18f)
                horizontalLineTo(9.503f)
                curveTo(9.779f, 18f, 10.003f, 17.776f, 10.003f, 17.5f)
                curveTo(10.003f, 17.224f, 9.779f, 17f, 9.503f, 17f)
                horizontalLineTo(7f)
                lineTo(7f, 14.499f)
                curveTo(7f, 14.223f, 6.776f, 13.999f, 6.5f, 13.999f)
                curveTo(6.224f, 13.999f, 6f, 14.223f, 6f, 14.499f)
                lineTo(6f, 17f)
                horizontalLineTo(3.496f)
                curveTo(3.22f, 17f, 2.996f, 17.224f, 2.996f, 17.5f)
                curveTo(2.996f, 17.776f, 3.22f, 18f, 3.496f, 18f)
                horizontalLineTo(6.001f)
                lineTo(6.001f, 20.503f)
                curveTo(6.001f, 20.78f, 6.225f, 21.003f, 6.501f, 21.003f)
                curveTo(6.777f, 21.003f, 7.001f, 20.78f, 7.001f, 20.503f)
                close()
                moveTo(12.5f, 6.75f)
                curveTo(12.5f, 6.336f, 12.164f, 6f, 11.75f, 6f)
                curveTo(11.336f, 6f, 11f, 6.336f, 11f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(11f, 13.164f, 11.336f, 13.5f, 11.75f, 13.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 13.5f, 17f, 13.164f, 17f, 12.75f)
                curveTo(17f, 12.336f, 16.664f, 12f, 16.25f, 12f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _ShiftsAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ShiftsAdd: ImageVector? = null

@Preview
@Composable
private fun ShiftsAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShiftsAdd, contentDescription = null)
    }
}
