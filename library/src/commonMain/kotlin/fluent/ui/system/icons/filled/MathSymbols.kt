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

public val FluentUi.Filled.MathSymbols: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MathSymbols",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 1.5f)
            curveTo(7.052f, 1.5f, 7.5f, 1.948f, 7.5f, 2.5f)
            verticalLineTo(5f)
            horizontalLineTo(10.002f)
            curveTo(10.554f, 5f, 11.002f, 5.448f, 11.002f, 6f)
            curveTo(11.002f, 6.552f, 10.554f, 7f, 10.002f, 7f)
            horizontalLineTo(7.5f)
            verticalLineTo(9.5f)
            curveTo(7.5f, 10.052f, 7.052f, 10.5f, 6.5f, 10.5f)
            curveTo(5.948f, 10.5f, 5.5f, 10.052f, 5.5f, 9.5f)
            verticalLineTo(7f)
            horizontalLineTo(3.002f)
            curveTo(2.45f, 7f, 2.002f, 6.552f, 2.002f, 6f)
            curveTo(2.002f, 5.448f, 2.45f, 5f, 3.002f, 5f)
            horizontalLineTo(5.5f)
            verticalLineTo(2.5f)
            curveTo(5.5f, 1.948f, 5.948f, 1.5f, 6.5f, 1.5f)
            close()
            moveTo(13.998f, 5f)
            curveTo(13.446f, 5f, 12.998f, 5.448f, 12.998f, 6f)
            curveTo(12.998f, 6.552f, 13.446f, 7f, 13.998f, 7f)
            horizontalLineTo(20.998f)
            curveTo(21.55f, 7f, 21.998f, 6.552f, 21.998f, 6f)
            curveTo(21.998f, 5.448f, 21.55f, 5f, 20.998f, 5f)
            horizontalLineTo(13.998f)
            close()
            moveTo(13f, 17.5f)
            curveTo(13f, 16.948f, 13.448f, 16.5f, 14f, 16.5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 16.5f, 22f, 16.948f, 22f, 17.5f)
            curveTo(22f, 18.052f, 21.552f, 18.5f, 21f, 18.5f)
            horizontalLineTo(14f)
            curveTo(13.448f, 18.5f, 13f, 18.052f, 13f, 17.5f)
            close()
            moveTo(17.5f, 15.5f)
            curveTo(18.19f, 15.5f, 18.75f, 14.94f, 18.75f, 14.25f)
            curveTo(18.75f, 13.56f, 18.19f, 13f, 17.5f, 13f)
            curveTo(16.81f, 13f, 16.25f, 13.56f, 16.25f, 14.25f)
            curveTo(16.25f, 14.94f, 16.81f, 15.5f, 17.5f, 15.5f)
            close()
            moveTo(18.75f, 20.75f)
            curveTo(18.75f, 21.44f, 18.19f, 22f, 17.5f, 22f)
            curveTo(16.81f, 22f, 16.25f, 21.44f, 16.25f, 20.75f)
            curveTo(16.25f, 20.06f, 16.81f, 19.5f, 17.5f, 19.5f)
            curveTo(18.19f, 19.5f, 18.75f, 20.06f, 18.75f, 20.75f)
            close()
            moveTo(2.293f, 13.293f)
            curveTo(2.683f, 12.902f, 3.317f, 12.902f, 3.707f, 13.293f)
            lineTo(6.5f, 16.086f)
            lineTo(9.293f, 13.293f)
            curveTo(9.683f, 12.902f, 10.317f, 12.902f, 10.707f, 13.293f)
            curveTo(11.098f, 13.683f, 11.098f, 14.317f, 10.707f, 14.707f)
            lineTo(7.914f, 17.5f)
            lineTo(10.707f, 20.293f)
            curveTo(11.098f, 20.683f, 11.098f, 21.317f, 10.707f, 21.707f)
            curveTo(10.317f, 22.098f, 9.683f, 22.098f, 9.293f, 21.707f)
            lineTo(6.5f, 18.914f)
            lineTo(3.707f, 21.707f)
            curveTo(3.317f, 22.098f, 2.683f, 22.098f, 2.293f, 21.707f)
            curveTo(1.902f, 21.317f, 1.902f, 20.683f, 2.293f, 20.293f)
            lineTo(5.086f, 17.5f)
            lineTo(2.293f, 14.707f)
            curveTo(1.902f, 14.317f, 1.902f, 13.683f, 2.293f, 13.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MathSymbolsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MathSymbols, contentDescription = null)
    }
}
