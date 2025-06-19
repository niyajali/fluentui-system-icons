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

public val FluentIcons.Filled.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) {
            return _PaintBrush!!
        }
        _PaintBrush = ImageVector.Builder(
            name = "Filled.PaintBrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.5f, 2f)
                verticalLineTo(5.252f)
                curveTo(12.5f, 5.666f, 12.836f, 6.002f, 13.25f, 6.002f)
                curveTo(13.664f, 6.002f, 14f, 5.666f, 14f, 5.252f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(6.251f)
                curveTo(15f, 6.665f, 15.336f, 7.001f, 15.75f, 7.001f)
                curveTo(16.164f, 7.001f, 16.5f, 6.665f, 16.5f, 6.251f)
                verticalLineTo(2f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 2f, 19f, 2.336f, 19f, 2.75f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(2.75f)
                curveTo(5f, 2.336f, 5.336f, 2f, 5.75f, 2f)
                horizontalLineTo(12.5f)
                close()
                moveTo(5f, 12.5f)
                verticalLineTo(14.252f)
                curveTo(5f, 15.495f, 6.008f, 16.502f, 7.25f, 16.502f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                curveTo(10f, 21.105f, 10.895f, 22f, 12f, 22f)
                curveTo(13.104f, 22f, 14f, 21.105f, 14f, 20f)
                verticalLineTo(16.502f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 16.502f, 19f, 15.495f, 19f, 14.252f)
                verticalLineTo(12.5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _PaintBrush!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrush: ImageVector? = null

@Preview
@Composable
private fun PaintBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PaintBrush, contentDescription = null)
    }
}
