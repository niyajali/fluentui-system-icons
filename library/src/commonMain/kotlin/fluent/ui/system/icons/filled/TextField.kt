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

public val FluentUi.Filled.TextField: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextField",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 4.679f, 3.679f, 3f, 5.75f, 3f)
            horizontalLineTo(18.25f)
            curveTo(20.321f, 3f, 22f, 4.679f, 22f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(22f, 19.321f, 20.321f, 21f, 18.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 21f, 2f, 19.321f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(12.75f, 7.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(8.25f)
            curveTo(15.5f, 8.664f, 15.836f, 9f, 16.25f, 9f)
            curveTo(16.664f, 9f, 17f, 8.664f, 17f, 8.25f)
            verticalLineTo(6.75f)
            curveTo(17f, 6.336f, 16.664f, 6f, 16.25f, 6f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 6f, 7f, 6.336f, 7f, 6.75f)
            verticalLineTo(8.25f)
            curveTo(7f, 8.664f, 7.336f, 9f, 7.75f, 9f)
            curveTo(8.164f, 9f, 8.5f, 8.664f, 8.5f, 8.25f)
            verticalLineTo(7.5f)
            horizontalLineTo(11.25f)
            verticalLineTo(16.5f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 16.5f, 10f, 16.836f, 10f, 17.25f)
            curveTo(10f, 17.664f, 10.336f, 18f, 10.75f, 18f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 18f, 14f, 17.664f, 14f, 17.25f)
            curveTo(14f, 16.836f, 13.664f, 16.5f, 13.25f, 16.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(7.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextFieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextField, contentDescription = null)
    }
}
