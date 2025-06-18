package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.Person: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Person",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 2f)
            curveTo(12.134f, 2f, 9f, 5.134f, 9f, 9f)
            curveTo(9f, 12.866f, 12.134f, 16f, 16f, 16f)
            curveTo(19.866f, 16f, 23f, 12.866f, 23f, 9f)
            curveTo(23f, 5.134f, 19.866f, 2f, 16f, 2f)
            close()
            moveTo(10f, 9f)
            curveTo(10f, 5.686f, 12.686f, 3f, 16f, 3f)
            curveTo(19.314f, 3f, 22f, 5.686f, 22f, 9f)
            curveTo(22f, 12.314f, 19.314f, 15f, 16f, 15f)
            curveTo(12.686f, 15f, 10f, 12.314f, 10f, 9f)
            close()
            moveTo(7.5f, 18f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22.167f)
            curveTo(4f, 24.316f, 6.766f, 30f, 16f, 30f)
            curveTo(25.234f, 30f, 28f, 24.316f, 28f, 22.167f)
            lineTo(28f, 21.5f)
            curveTo(28f, 19.567f, 26.433f, 18f, 24.5f, 18f)
            horizontalLineTo(7.5f)
            close()
            moveTo(5f, 21.5f)
            curveTo(5f, 20.119f, 6.119f, 19f, 7.5f, 19f)
            horizontalLineTo(24.5f)
            curveTo(25.881f, 19f, 27f, 20.119f, 27f, 21.5f)
            lineTo(27f, 22.167f)
            curveTo(27f, 23.684f, 24.765f, 29f, 16f, 29f)
            curveTo(7.234f, 29f, 5f, 23.684f, 5f, 22.167f)
            verticalLineTo(21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Person, contentDescription = null)
    }
}
