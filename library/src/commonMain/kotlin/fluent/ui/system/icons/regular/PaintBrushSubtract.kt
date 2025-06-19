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

public val FluentIcons.Regular.PaintBrushSubtract: ImageVector
    get() {
        if (_PaintBrushSubtract != null) {
            return _PaintBrushSubtract!!
        }
        _PaintBrushSubtract = ImageVector.Builder(
            name = "Regular.PaintBrushSubtract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 2f)
                curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
                verticalLineTo(14.25f)
                curveTo(5f, 15.493f, 6.007f, 16.5f, 7.25f, 16.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.5f)
                curveTo(9.5f, 20.881f, 10.619f, 22f, 12f, 22f)
                curveTo(12.248f, 22f, 12.487f, 21.964f, 12.713f, 21.897f)
                curveTo(12.317f, 21.466f, 11.979f, 20.983f, 11.71f, 20.457f)
                curveTo(11.299f, 20.333f, 11f, 19.952f, 11f, 19.5f)
                verticalLineTo(15.75f)
                curveTo(11f, 15.336f, 10.664f, 15f, 10.25f, 15f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 15f, 6.5f, 14.665f, 6.5f, 14.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(13.346f)
                curveTo(14.457f, 11.576f, 15.882f, 11.015f, 17.437f, 11f)
                horizontalLineTo(6.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(5.252f)
                curveTo(12.5f, 5.666f, 12.835f, 6.002f, 13.25f, 6.002f)
                curveTo(13.664f, 6.002f, 14f, 5.666f, 14f, 5.252f)
                verticalLineTo(3.5f)
                horizontalLineTo(15f)
                verticalLineTo(6.251f)
                curveTo(15f, 6.665f, 15.335f, 7.001f, 15.75f, 7.001f)
                curveTo(16.164f, 7.001f, 16.5f, 6.665f, 16.5f, 6.251f)
                verticalLineTo(3.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(11f)
                curveTo(18.016f, 11f, 18.518f, 11.06f, 19f, 11.174f)
                verticalLineTo(2.75f)
                curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
                horizontalLineTo(5.75f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(20.497f, 18f)
                curveTo(20.772f, 18f, 20.996f, 17.776f, 20.996f, 17.5f)
                curveTo(20.996f, 17.224f, 20.772f, 17f, 20.497f, 17f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
                curveTo(13.996f, 17.776f, 14.22f, 18f, 14.496f, 18f)
                horizontalLineTo(20.497f)
                close()
            }
        }.build()

        return _PaintBrushSubtract!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushSubtract: ImageVector? = null

@Preview
@Composable
private fun PaintBrushSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PaintBrushSubtract, contentDescription = null)
    }
}
