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

public val FluentIcons.Filled.Badge: ImageVector
    get() {
        if (_Badge != null) {
            return _Badge!!
        }
        _Badge = ImageVector.Builder(
            name = "Filled.Badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 4.502f)
                curveTo(16f, 6.435f, 17.567f, 8.002f, 19.5f, 8.002f)
                curveTo(20.037f, 8.002f, 20.546f, 7.881f, 21.001f, 7.665f)
                lineTo(21f, 18.25f)
                curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                lineTo(16.338f, 3f)
                curveTo(16.121f, 3.455f, 16f, 3.964f, 16f, 4.502f)
                close()
                moveTo(19.5f, 2.002f)
                curveTo(20.881f, 2.002f, 22f, 3.121f, 22f, 4.502f)
                curveTo(22f, 5.883f, 20.881f, 7.002f, 19.5f, 7.002f)
                curveTo(18.119f, 7.002f, 17f, 5.883f, 17f, 4.502f)
                curveTo(17f, 3.121f, 18.119f, 2.002f, 19.5f, 2.002f)
                close()
            }
        }.build()

        return _Badge!!
    }

@Suppress("ObjectPropertyName")
private var _Badge: ImageVector? = null

@Preview
@Composable
private fun BadgePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Badge, contentDescription = null)
    }
}
