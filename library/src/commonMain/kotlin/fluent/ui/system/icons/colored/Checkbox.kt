package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.Checkbox: ImageVector
    get() {
        if (_Checkbox != null) {
            return _Checkbox!!
        }
        _Checkbox = ImageVector.Builder(
            name = "Colored.Checkbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(3.643f, 6.375f),
                    end = Offset(16.065f, 19.281f)
                )
            ) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFB3E0FF)
                    ),
                    start = Offset(8.616f, 8.634f),
                    end = Offset(13.467f, 24.313f)
                )
            ) {
                moveTo(17.28f, 9.281f)
                lineTo(10.526f, 16.027f)
                curveTo(10.233f, 16.319f, 9.759f, 16.319f, 9.466f, 16.026f)
                lineTo(6.72f, 13.28f)
                curveTo(6.427f, 12.987f, 6.427f, 12.512f, 6.72f, 12.22f)
                curveTo(7.013f, 11.927f, 7.488f, 11.927f, 7.781f, 12.22f)
                lineTo(9.997f, 14.436f)
                lineTo(16.22f, 8.219f)
                curveTo(16.513f, 7.927f, 16.988f, 7.927f, 17.281f, 8.22f)
                curveTo(17.573f, 8.513f, 17.573f, 8.988f, 17.28f, 9.281f)
                close()
            }
        }.build()

        return _Checkbox!!
    }

@Suppress("ObjectPropertyName")
private var _Checkbox: ImageVector? = null

@Preview
@Composable
private fun CheckboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Checkbox, contentDescription = null)
    }
}
