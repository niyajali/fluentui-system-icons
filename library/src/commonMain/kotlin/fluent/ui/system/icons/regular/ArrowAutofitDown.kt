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

public val FluentUi.Regular.ArrowAutofitDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowAutofitDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.22f, 17.219f)
            curveTo(12.953f, 17.485f, 12.929f, 17.902f, 13.147f, 18.195f)
            lineTo(13.22f, 18.279f)
            lineTo(15.587f, 20.65f)
            curveTo(15.713f, 20.858f, 15.963f, 21f, 16.251f, 21f)
            curveTo(16.503f, 21f, 16.726f, 20.891f, 16.862f, 20.724f)
            lineTo(16.915f, 20.649f)
            lineTo(19.282f, 18.279f)
            lineTo(19.355f, 18.195f)
            curveTo(19.548f, 17.934f, 19.551f, 17.576f, 19.362f, 17.313f)
            lineTo(19.282f, 17.219f)
            lineTo(19.198f, 17.146f)
            curveTo(18.937f, 16.953f, 18.579f, 16.95f, 18.315f, 17.139f)
            lineTo(18.221f, 17.219f)
            lineTo(17f, 18.44f)
            verticalLineTo(3.656f)
            lineTo(16.993f, 3.567f)
            curveTo(16.943f, 3.247f, 16.63f, 3f, 16.25f, 3f)
            curveTo(15.87f, 3f, 15.557f, 3.247f, 15.507f, 3.567f)
            lineTo(15.5f, 3.656f)
            verticalLineTo(18.44f)
            lineTo(14.28f, 17.219f)
            lineTo(14.196f, 17.146f)
            curveTo(13.903f, 16.928f, 13.486f, 16.953f, 13.22f, 17.219f)
            close()
            moveTo(6.25f, 20.008f)
            curveTo(5.007f, 20.008f, 4f, 19f, 4f, 17.758f)
            verticalLineTo(6.258f)
            curveTo(4f, 5.015f, 5.007f, 4.008f, 6.25f, 4.008f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 4.008f, 13f, 4.344f, 13f, 4.758f)
            curveTo(13f, 5.172f, 12.664f, 5.508f, 12.25f, 5.508f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 5.508f, 5.5f, 5.844f, 5.5f, 6.258f)
            verticalLineTo(17.758f)
            curveTo(5.5f, 18.172f, 5.836f, 18.508f, 6.25f, 18.508f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 18.508f, 11f, 18.844f, 11f, 19.258f)
            curveTo(11f, 19.672f, 10.664f, 20.008f, 10.25f, 20.008f)
            horizontalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowAutofitDown, contentDescription = null)
    }
}
