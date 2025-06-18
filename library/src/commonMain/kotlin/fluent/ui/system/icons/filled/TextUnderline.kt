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

public val FluentUi.Filled.TextUnderline: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderline",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 5f)
            curveTo(17f, 4.735f, 16.895f, 4.48f, 16.707f, 4.293f)
            curveTo(16.52f, 4.105f, 16.265f, 4f, 16f, 4f)
            horizontalLineTo(8f)
            curveTo(7.735f, 4f, 7.48f, 4.105f, 7.293f, 4.293f)
            curveTo(7.105f, 4.48f, 7f, 4.735f, 7f, 5f)
            lineTo(7f, 15.5f)
            curveTo(7f, 16.052f, 7.448f, 16.5f, 8f, 16.5f)
            curveTo(8.552f, 16.5f, 9f, 16.052f, 9f, 15.5f)
            lineTo(9f, 6f)
            lineTo(15f, 6f)
            verticalLineTo(15.5f)
            curveTo(15f, 16.052f, 15.448f, 16.5f, 16f, 16.5f)
            curveTo(16.552f, 16.5f, 17f, 16.052f, 17f, 15.5f)
            verticalLineTo(5f)
            close()
            moveTo(7f, 18f)
            curveTo(6.448f, 18f, 6f, 18.448f, 6f, 19f)
            curveTo(6f, 19.552f, 6.448f, 20f, 7f, 20f)
            horizontalLineTo(17f)
            curveTo(17.552f, 20f, 18f, 19.552f, 18f, 19f)
            curveTo(18f, 18.448f, 17.552f, 18f, 17f, 18f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextUnderlinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextUnderline, contentDescription = null)
    }
}
