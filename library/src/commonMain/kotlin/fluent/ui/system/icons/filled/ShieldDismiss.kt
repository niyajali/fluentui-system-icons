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

public val FluentUi.Filled.ShieldDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.45f, 2.15f)
            curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
            curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
            verticalLineTo(11f)
            curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
            curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
            curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
            verticalLineTo(5.75f)
            curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
            curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
            curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
            close()
            moveTo(9.281f, 8.222f)
            curveTo(8.988f, 7.929f, 8.514f, 7.929f, 8.222f, 8.222f)
            curveTo(7.956f, 8.488f, 7.931f, 8.904f, 8.149f, 9.197f)
            lineTo(8.222f, 9.281f)
            lineTo(10.945f, 12.004f)
            lineTo(8.222f, 14.729f)
            curveTo(7.929f, 15.021f, 7.929f, 15.495f, 8.222f, 15.788f)
            curveTo(8.514f, 16.081f, 8.988f, 16.081f, 9.281f, 15.788f)
            lineTo(12.004f, 13.064f)
            lineTo(14.729f, 15.788f)
            curveTo(14.995f, 16.054f, 15.411f, 16.078f, 15.704f, 15.861f)
            lineTo(15.788f, 15.788f)
            curveTo(16.054f, 15.522f, 16.078f, 15.106f, 15.861f, 14.813f)
            lineTo(15.788f, 14.729f)
            lineTo(13.064f, 12.004f)
            lineTo(15.788f, 9.281f)
            curveTo(16.081f, 8.988f, 16.081f, 8.514f, 15.788f, 8.222f)
            curveTo(15.495f, 7.929f, 15.021f, 7.929f, 14.729f, 8.222f)
            lineTo(12.004f, 10.945f)
            lineTo(9.281f, 8.222f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShieldDismiss, contentDescription = null)
    }
}
