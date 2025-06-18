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

public val FluentUi.Regular.CreditCardToolbox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CreditCardToolbox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 5f)
            curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(11f)
            verticalLineTo(17.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 17.5f, 3.5f, 16.716f, 3.5f, 15.75f)
            verticalLineTo(11f)
            horizontalLineTo(22f)
            verticalLineTo(8.25f)
            curveTo(22f, 6.455f, 20.545f, 5f, 18.75f, 5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(20.5f, 8.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(8.25f)
            curveTo(3.5f, 7.284f, 4.284f, 6.5f, 5.25f, 6.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 6.5f, 20.5f, 7.284f, 20.5f, 8.25f)
            close()
            moveTo(13.5f, 14.75f)
            horizontalLineTo(14f)
            verticalLineTo(13.75f)
            curveTo(14f, 12.783f, 14.783f, 12f, 15.75f, 12f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 12f, 21f, 12.783f, 21f, 13.75f)
            verticalLineTo(14.75f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 14.75f, 23f, 15.422f, 23f, 16.25f)
            verticalLineTo(18f)
            horizontalLineTo(20f)
            verticalLineTo(17.5f)
            curveTo(20f, 17.224f, 19.776f, 17f, 19.5f, 17f)
            curveTo(19.224f, 17f, 19f, 17.224f, 19f, 17.5f)
            verticalLineTo(18f)
            horizontalLineTo(16f)
            verticalLineTo(17.5f)
            curveTo(16f, 17.224f, 15.776f, 17f, 15.5f, 17f)
            curveTo(15.224f, 17f, 15f, 17.224f, 15f, 17.5f)
            verticalLineTo(18f)
            horizontalLineTo(12f)
            verticalLineTo(16.25f)
            curveTo(12f, 15.422f, 12.672f, 14.75f, 13.5f, 14.75f)
            close()
            moveTo(15.75f, 13.5f)
            curveTo(15.612f, 13.5f, 15.5f, 13.612f, 15.5f, 13.75f)
            verticalLineTo(14.75f)
            horizontalLineTo(19.5f)
            verticalLineTo(13.75f)
            curveTo(19.5f, 13.612f, 19.388f, 13.5f, 19.25f, 13.5f)
            horizontalLineTo(15.75f)
            close()
            moveTo(19f, 19.5f)
            verticalLineTo(19f)
            horizontalLineTo(16f)
            verticalLineTo(19.5f)
            curveTo(16f, 19.776f, 15.776f, 20f, 15.5f, 20f)
            curveTo(15.224f, 20f, 15f, 19.776f, 15f, 19.5f)
            verticalLineTo(19f)
            horizontalLineTo(12f)
            verticalLineTo(21.5f)
            curveTo(12f, 22.328f, 12.672f, 23f, 13.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(19f)
            horizontalLineTo(20f)
            verticalLineTo(19.5f)
            curveTo(20f, 19.776f, 19.776f, 20f, 19.5f, 20f)
            curveTo(19.224f, 20f, 19f, 19.776f, 19f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CreditCardToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CreditCardToolbox, contentDescription = null)
    }
}
