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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CrownSubtract: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CrownSubtract",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.457f, 6.37f)
            curveTo(13.794f, 6.012f, 14f, 5.53f, 14f, 5f)
            curveTo(14f, 3.895f, 13.105f, 3f, 12f, 3f)
            curveTo(10.895f, 3f, 10f, 3.895f, 10f, 5f)
            curveTo(10f, 5.53f, 10.206f, 6.012f, 10.543f, 6.37f)
            lineTo(7.919f, 9.65f)
            curveTo(7.846f, 9.742f, 7.718f, 9.77f, 7.612f, 9.718f)
            lineTo(4.962f, 8.392f)
            curveTo(4.987f, 8.265f, 5f, 8.134f, 5f, 8f)
            curveTo(5f, 6.895f, 4.105f, 6f, 3f, 6f)
            curveTo(1.895f, 6f, 1f, 6.895f, 1f, 8f)
            curveTo(1f, 8.952f, 1.665f, 9.748f, 2.556f, 9.95f)
            lineTo(4.36f, 19.573f)
            curveTo(4.515f, 20.4f, 5.238f, 21f, 6.08f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
            horizontalLineTo(6.08f)
            curveTo(5.96f, 19.5f, 5.856f, 19.414f, 5.834f, 19.296f)
            lineTo(4.037f, 9.711f)
            curveTo(4.068f, 9.692f, 4.098f, 9.672f, 4.127f, 9.652f)
            lineTo(6.942f, 11.059f)
            curveTo(7.68f, 11.428f, 8.575f, 11.232f, 9.091f, 10.587f)
            lineTo(11.961f, 7f)
            curveTo(11.974f, 7f, 11.987f, 7f, 12f, 7f)
            curveTo(12.013f, 7f, 12.026f, 7f, 12.039f, 7f)
            lineTo(14.909f, 10.587f)
            curveTo(15.165f, 10.906f, 15.513f, 11.116f, 15.89f, 11.201f)
            curveTo(16.299f, 11.097f, 16.724f, 11.031f, 17.16f, 11.009f)
            lineTo(19.873f, 9.652f)
            curveTo(19.902f, 9.672f, 19.932f, 9.692f, 19.963f, 9.711f)
            lineTo(19.653f, 11.365f)
            curveTo(20.149f, 11.539f, 20.617f, 11.771f, 21.05f, 12.054f)
            lineTo(21.444f, 9.95f)
            curveTo(22.335f, 9.748f, 23f, 8.952f, 23f, 8f)
            curveTo(23f, 6.895f, 22.105f, 6f, 21f, 6f)
            curveTo(19.895f, 6f, 19f, 6.895f, 19f, 8f)
            curveTo(19f, 8.134f, 19.013f, 8.265f, 19.038f, 8.392f)
            lineTo(16.388f, 9.718f)
            curveTo(16.282f, 9.77f, 16.154f, 9.742f, 16.081f, 9.65f)
            lineTo(13.457f, 6.37f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(14f, 17.5f)
            curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 18f, 21f, 17.776f, 21f, 17.5f)
            curveTo(21f, 17.224f, 20.776f, 17f, 20.5f, 17f)
            horizontalLineTo(14.5f)
            curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CrownSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CrownSubtract, contentDescription = null)
    }
}
