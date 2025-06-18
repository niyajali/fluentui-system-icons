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

public val FluentUi.Filled.Payment: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Payment",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 5f)
            curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(22f)
            verticalLineTo(8.25f)
            curveTo(22f, 6.455f, 20.545f, 5f, 18.75f, 5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(22f, 11f)
            horizontalLineTo(2f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 19f, 22f, 17.545f, 22f, 15.75f)
            verticalLineTo(11f)
            close()
            moveTo(15.75f, 14.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 14.5f, 19f, 14.836f, 19f, 15.25f)
            curveTo(19f, 15.664f, 18.664f, 16f, 18.25f, 16f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 16f, 15f, 15.664f, 15f, 15.25f)
            curveTo(15f, 14.836f, 15.336f, 14.5f, 15.75f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaymentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Payment, contentDescription = null)
    }
}
