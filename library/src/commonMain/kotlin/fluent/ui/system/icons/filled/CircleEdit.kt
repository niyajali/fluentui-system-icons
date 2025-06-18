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

public val FluentUi.Filled.CircleEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.715f, 11f)
            curveTo(21.142f, 11f, 21.57f, 11.083f, 21.972f, 11.25f)
            curveTo(21.589f, 6.077f, 17.271f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.184f, 5.945f, 21.447f, 10.997f, 21.95f)
            curveTo(10.995f, 21.773f, 11.015f, 21.591f, 11.061f, 21.407f)
            lineTo(11.519f, 19.577f)
            curveTo(11.681f, 18.929f, 12.016f, 18.337f, 12.488f, 17.865f)
            lineTo(18.391f, 11.962f)
            curveTo(19.032f, 11.321f, 19.874f, 11f, 20.713f, 11f)
            horizontalLineTo(20.715f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.715f, 12f)
            horizontalLineTo(20.713f)
            curveTo(20.128f, 12f, 19.544f, 12.223f, 19.098f, 12.67f)
            lineTo(13.196f, 18.572f)
            curveTo(12.851f, 18.916f, 12.607f, 19.347f, 12.489f, 19.819f)
            lineTo(12.031f, 21.65f)
            curveTo(11.833f, 22.446f, 12.554f, 23.167f, 13.35f, 22.968f)
            lineTo(15.18f, 22.511f)
            curveTo(15.653f, 22.393f, 16.084f, 22.149f, 16.428f, 21.804f)
            lineTo(22.33f, 15.902f)
            curveTo(23.223f, 15.009f, 23.223f, 13.562f, 22.33f, 12.67f)
            curveTo(21.884f, 12.223f, 21.3f, 12f, 20.715f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CircleEdit, contentDescription = null)
    }
}
