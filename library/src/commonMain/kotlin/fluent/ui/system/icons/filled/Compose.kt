package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.Compose: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.957f, 13.457f)
            lineTo(21.707f, 3.707f)
            curveTo(22.098f, 3.317f, 22.098f, 2.683f, 21.707f, 2.293f)
            curveTo(21.317f, 1.902f, 20.683f, 1.902f, 20.293f, 2.293f)
            lineTo(10.543f, 12.043f)
            lineTo(10.25f, 13.75f)
            lineTo(11.957f, 13.457f)
            close()
            moveTo(6.5f, 3f)
            curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
            verticalLineTo(17.5f)
            curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
            horizontalLineTo(17.5f)
            curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
            verticalLineTo(10f)
            curveTo(21f, 9.448f, 20.552f, 9f, 20f, 9f)
            curveTo(19.448f, 9f, 19f, 9.448f, 19f, 10f)
            verticalLineTo(17.5f)
            curveTo(19f, 18.328f, 18.328f, 19f, 17.5f, 19f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
            verticalLineTo(6.5f)
            curveTo(5f, 5.672f, 5.672f, 5f, 6.5f, 5f)
            horizontalLineTo(14f)
            curveTo(14.552f, 5f, 15f, 4.552f, 15f, 4f)
            curveTo(15f, 3.448f, 14.552f, 3f, 14f, 3f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ComposePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Compose, contentDescription = null)
    }
}
