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

public val FluentUi.Regular.Bed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bed",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 4f)
            horizontalLineTo(17.25f)
            curveTo(18.712f, 4f, 19.908f, 5.142f, 19.995f, 6.582f)
            lineTo(20f, 6.75f)
            lineTo(20.001f, 10.104f)
            curveTo(21.097f, 10.414f, 21.915f, 11.387f, 21.994f, 12.563f)
            lineTo(22f, 12.75f)
            verticalLineTo(20.25f)
            curveTo(22f, 20.664f, 21.664f, 21f, 21.25f, 21f)
            curveTo(20.87f, 21f, 20.556f, 20.718f, 20.507f, 20.352f)
            lineTo(20.5f, 20.25f)
            verticalLineTo(18f)
            horizontalLineTo(3.5f)
            verticalLineTo(20.25f)
            curveTo(3.5f, 20.63f, 3.218f, 20.944f, 2.852f, 20.993f)
            lineTo(2.75f, 21f)
            curveTo(2.37f, 21f, 2.057f, 20.718f, 2.007f, 20.352f)
            lineTo(2f, 20.25f)
            verticalLineTo(12.75f)
            curveTo(2f, 11.491f, 2.846f, 10.43f, 4f, 10.103f)
            lineTo(4f, 6.75f)
            curveTo(4f, 5.287f, 5.142f, 4.092f, 6.582f, 4.005f)
            lineTo(6.75f, 4f)
            close()
            moveTo(19.25f, 11.5f)
            horizontalLineTo(4.75f)
            curveTo(4.103f, 11.5f, 3.57f, 11.992f, 3.506f, 12.622f)
            lineTo(3.5f, 12.75f)
            verticalLineTo(16.5f)
            horizontalLineTo(20.5f)
            verticalLineTo(12.75f)
            curveTo(20.5f, 12.103f, 20.008f, 11.571f, 19.378f, 11.507f)
            lineTo(19.25f, 11.5f)
            close()
            moveTo(17.25f, 5.5f)
            horizontalLineTo(6.75f)
            curveTo(6.103f, 5.5f, 5.57f, 5.992f, 5.506f, 6.622f)
            lineTo(5.5f, 6.75f)
            verticalLineTo(10f)
            horizontalLineTo(7f)
            curveTo(7f, 9.448f, 7.448f, 9f, 8f, 9f)
            horizontalLineTo(10f)
            curveTo(10.513f, 9f, 10.936f, 9.386f, 10.993f, 9.883f)
            lineTo(11f, 10f)
            horizontalLineTo(13f)
            curveTo(13f, 9.448f, 13.448f, 9f, 14f, 9f)
            horizontalLineTo(16f)
            curveTo(16.513f, 9f, 16.935f, 9.386f, 16.993f, 9.883f)
            lineTo(17f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(6.75f)
            curveTo(18.5f, 6.103f, 18.008f, 5.57f, 17.378f, 5.506f)
            lineTo(17.25f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Bed, contentDescription = null)
    }
}
