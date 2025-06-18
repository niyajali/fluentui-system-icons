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

public val FluentUi.Filled.Dock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.707f, 3.293f)
            curveTo(12.317f, 2.902f, 11.683f, 2.902f, 11.293f, 3.293f)
            lineTo(7.793f, 6.793f)
            curveTo(7.402f, 7.183f, 7.402f, 7.817f, 7.793f, 8.207f)
            curveTo(8.183f, 8.598f, 8.817f, 8.598f, 9.207f, 8.207f)
            lineTo(11f, 6.414f)
            verticalLineTo(15f)
            curveTo(11f, 15.552f, 11.448f, 16f, 12f, 16f)
            curveTo(12.552f, 16f, 13f, 15.552f, 13f, 15f)
            verticalLineTo(6.414f)
            lineTo(14.793f, 8.207f)
            curveTo(15.183f, 8.598f, 15.817f, 8.598f, 16.207f, 8.207f)
            curveTo(16.598f, 7.817f, 16.598f, 7.183f, 16.207f, 6.793f)
            lineTo(12.707f, 3.293f)
            close()
            moveTo(4f, 12.75f)
            curveTo(4f, 12.336f, 4.336f, 12f, 4.75f, 12f)
            horizontalLineTo(9f)
            curveTo(9.552f, 12f, 10f, 11.552f, 10f, 11f)
            curveTo(10f, 10.448f, 9.552f, 10f, 9f, 10f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 10f, 2f, 11.231f, 2f, 12.75f)
            verticalLineTo(17.25f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
            verticalLineTo(12.75f)
            curveTo(22f, 11.231f, 20.769f, 10f, 19.25f, 10f)
            horizontalLineTo(15f)
            curveTo(14.448f, 10f, 14f, 10.448f, 14f, 11f)
            curveTo(14f, 11.552f, 14.448f, 12f, 15f, 12f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 12f, 20f, 12.336f, 20f, 12.75f)
            verticalLineTo(17.25f)
            curveTo(20f, 17.664f, 19.664f, 18f, 19.25f, 18f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 18f, 4f, 17.664f, 4f, 17.25f)
            verticalLineTo(12.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Dock, contentDescription = null)
    }
}
