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

public val FluentUi.Regular.DrinkBeer: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DrinkBeer",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 10f)
            curveTo(8.5f, 9.586f, 8.164f, 9.25f, 7.75f, 9.25f)
            curveTo(7.336f, 9.25f, 7f, 9.586f, 7f, 10f)
            verticalLineTo(17f)
            curveTo(7f, 17.414f, 7.336f, 17.75f, 7.75f, 17.75f)
            curveTo(8.164f, 17.75f, 8.5f, 17.414f, 8.5f, 17f)
            verticalLineTo(10f)
            close()
            moveTo(11.5f, 10f)
            curveTo(11.5f, 9.586f, 11.164f, 9.25f, 10.75f, 9.25f)
            curveTo(10.336f, 9.25f, 10f, 9.586f, 10f, 10f)
            verticalLineTo(17f)
            curveTo(10f, 17.414f, 10.336f, 17.75f, 10.75f, 17.75f)
            curveTo(11.164f, 17.75f, 11.5f, 17.414f, 11.5f, 17f)
            verticalLineTo(10f)
            close()
            moveTo(14.5f, 10f)
            curveTo(14.5f, 9.586f, 14.164f, 9.25f, 13.75f, 9.25f)
            curveTo(13.336f, 9.25f, 13f, 9.586f, 13f, 10f)
            verticalLineTo(17f)
            curveTo(13f, 17.414f, 13.336f, 17.75f, 13.75f, 17.75f)
            curveTo(14.164f, 17.75f, 14.5f, 17.414f, 14.5f, 17f)
            verticalLineTo(10f)
            close()
            moveTo(4f, 5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineTo(14.25f)
            curveTo(16.045f, 2f, 17.5f, 3.455f, 17.5f, 5.25f)
            verticalLineTo(6f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 6f, 22f, 7.455f, 22f, 9.25f)
            verticalLineTo(14.75f)
            curveTo(22f, 16.545f, 20.545f, 18f, 18.75f, 18f)
            horizontalLineTo(17.5f)
            verticalLineTo(19.75f)
            curveTo(17.5f, 20.993f, 16.493f, 22f, 15.25f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(16f, 7.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 20.5f, 16f, 20.164f, 16f, 19.75f)
            verticalLineTo(7.5f)
            close()
            moveTo(17.5f, 16.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 16.5f, 20.5f, 15.717f, 20.5f, 14.75f)
            verticalLineTo(9.25f)
            curveTo(20.5f, 8.283f, 19.716f, 7.5f, 18.75f, 7.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(16.5f)
            close()
            moveTo(16f, 5.25f)
            curveTo(16f, 4.284f, 15.217f, 3.5f, 14.25f, 3.5f)
            horizontalLineTo(7.25f)
            curveTo(6.284f, 3.5f, 5.5f, 4.284f, 5.5f, 5.25f)
            verticalLineTo(6f)
            horizontalLineTo(16f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrinkBeerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DrinkBeer, contentDescription = null)
    }
}
