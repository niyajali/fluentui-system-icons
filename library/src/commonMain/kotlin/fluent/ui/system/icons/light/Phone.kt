package fluent.ui.system.icons.light

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

public val FluentUi.Light.Phone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Phone",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.5f, 24f)
            curveTo(13.224f, 24f, 13f, 24.224f, 13f, 24.5f)
            curveTo(13f, 24.776f, 13.224f, 25f, 13.5f, 25f)
            horizontalLineTo(18.5f)
            curveTo(18.776f, 25f, 19f, 24.776f, 19f, 24.5f)
            curveTo(19f, 24.224f, 18.776f, 24f, 18.5f, 24f)
            horizontalLineTo(13.5f)
            close()
            moveTo(10.25f, 2f)
            curveTo(8.455f, 2f, 7f, 3.455f, 7f, 5.25f)
            verticalLineTo(26.75f)
            curveTo(7f, 28.545f, 8.455f, 30f, 10.25f, 30f)
            horizontalLineTo(21.75f)
            curveTo(23.545f, 30f, 25f, 28.545f, 25f, 26.75f)
            verticalLineTo(5.25f)
            curveTo(25f, 3.455f, 23.545f, 2f, 21.75f, 2f)
            horizontalLineTo(10.25f)
            close()
            moveTo(8f, 5.25f)
            curveTo(8f, 4.007f, 9.007f, 3f, 10.25f, 3f)
            horizontalLineTo(21.75f)
            curveTo(22.993f, 3f, 24f, 4.007f, 24f, 5.25f)
            verticalLineTo(26.75f)
            curveTo(24f, 27.993f, 22.993f, 29f, 21.75f, 29f)
            horizontalLineTo(10.25f)
            curveTo(9.007f, 29f, 8f, 27.993f, 8f, 26.75f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Phone, contentDescription = null)
    }
}
