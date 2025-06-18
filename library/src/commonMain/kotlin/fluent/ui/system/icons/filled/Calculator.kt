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

public val FluentUi.Filled.Calculator: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Calculator",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(9f, 5f)
            curveTo(7.895f, 5f, 7f, 5.895f, 7f, 7f)
            verticalLineTo(8f)
            curveTo(7f, 9.105f, 7.895f, 10f, 9f, 10f)
            horizontalLineTo(15f)
            curveTo(16.105f, 10f, 17f, 9.105f, 17f, 8f)
            verticalLineTo(7f)
            curveTo(17f, 5.895f, 16.105f, 5f, 15f, 5f)
            horizontalLineTo(9f)
            close()
            moveTo(9.5f, 13.25f)
            curveTo(9.5f, 12.56f, 8.94f, 12f, 8.25f, 12f)
            curveTo(7.56f, 12f, 7f, 12.56f, 7f, 13.25f)
            curveTo(7f, 13.94f, 7.56f, 14.5f, 8.25f, 14.5f)
            curveTo(8.94f, 14.5f, 9.5f, 13.94f, 9.5f, 13.25f)
            close()
            moveTo(8.25f, 18.5f)
            curveTo(8.94f, 18.5f, 9.5f, 17.94f, 9.5f, 17.25f)
            curveTo(9.5f, 16.56f, 8.94f, 16f, 8.25f, 16f)
            curveTo(7.56f, 16f, 7f, 16.56f, 7f, 17.25f)
            curveTo(7f, 17.94f, 7.56f, 18.5f, 8.25f, 18.5f)
            close()
            moveTo(17f, 13.25f)
            curveTo(17f, 12.56f, 16.44f, 12f, 15.75f, 12f)
            curveTo(15.06f, 12f, 14.5f, 12.56f, 14.5f, 13.25f)
            curveTo(14.5f, 13.94f, 15.06f, 14.5f, 15.75f, 14.5f)
            curveTo(16.44f, 14.5f, 17f, 13.94f, 17f, 13.25f)
            close()
            moveTo(15.75f, 18.5f)
            curveTo(16.44f, 18.5f, 17f, 17.94f, 17f, 17.25f)
            curveTo(17f, 16.56f, 16.44f, 16f, 15.75f, 16f)
            curveTo(15.06f, 16f, 14.5f, 16.56f, 14.5f, 17.25f)
            curveTo(14.5f, 17.94f, 15.06f, 18.5f, 15.75f, 18.5f)
            close()
            moveTo(13.25f, 13.25f)
            curveTo(13.25f, 12.56f, 12.69f, 12f, 12f, 12f)
            curveTo(11.31f, 12f, 10.75f, 12.56f, 10.75f, 13.25f)
            curveTo(10.75f, 13.94f, 11.31f, 14.5f, 12f, 14.5f)
            curveTo(12.69f, 14.5f, 13.25f, 13.94f, 13.25f, 13.25f)
            close()
            moveTo(12f, 18.5f)
            curveTo(12.69f, 18.5f, 13.25f, 17.94f, 13.25f, 17.25f)
            curveTo(13.25f, 16.56f, 12.69f, 16f, 12f, 16f)
            curveTo(11.31f, 16f, 10.75f, 16.56f, 10.75f, 17.25f)
            curveTo(10.75f, 17.94f, 11.31f, 18.5f, 12f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalculatorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Calculator, contentDescription = null)
    }
}
