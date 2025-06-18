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

public val FluentUi.Filled.Drawer: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drawer",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.406f, 3.891f)
            curveTo(6.777f, 3.334f, 7.402f, 3f, 8.07f, 3f)
            horizontalLineTo(15.93f)
            curveTo(16.598f, 3f, 17.223f, 3.334f, 17.594f, 3.891f)
            lineTo(19.664f, 6.996f)
            curveTo(19.883f, 7.325f, 20f, 7.711f, 20f, 8.106f)
            verticalLineTo(11f)
            curveTo(20f, 11.552f, 19.552f, 12f, 19f, 12f)
            horizontalLineTo(18.643f)
            lineTo(19.5f, 14f)
            curveTo(20.328f, 14f, 21f, 14.672f, 21f, 15.5f)
            verticalLineTo(19.5f)
            curveTo(21f, 20.328f, 20.328f, 21f, 19.5f, 21f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 21f, 3f, 20.328f, 3f, 19.5f)
            verticalLineTo(15.5f)
            curveTo(3f, 14.672f, 3.672f, 14f, 4.5f, 14f)
            lineTo(5.357f, 12f)
            horizontalLineTo(5f)
            curveTo(4.448f, 12f, 4f, 11.552f, 4f, 11f)
            verticalLineTo(8.106f)
            curveTo(4f, 7.711f, 4.117f, 7.325f, 4.336f, 6.996f)
            lineTo(6.406f, 3.891f)
            close()
            moveTo(6f, 10.5f)
            lineTo(6.857f, 8.5f)
            horizontalLineTo(5.5f)
            verticalLineTo(10.5f)
            horizontalLineTo(6f)
            close()
            moveTo(15.511f, 8.5f)
            horizontalLineTo(8.489f)
            lineTo(6.153f, 13.951f)
            lineTo(6.177f, 14f)
            horizontalLineTo(17.823f)
            lineTo(17.847f, 13.951f)
            lineTo(15.511f, 8.5f)
            close()
            moveTo(17.143f, 8.5f)
            lineTo(18f, 10.5f)
            horizontalLineTo(18.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(17.143f)
            close()
            moveTo(10.25f, 16.75f)
            curveTo(9.836f, 16.75f, 9.5f, 17.086f, 9.5f, 17.5f)
            curveTo(9.5f, 17.914f, 9.836f, 18.25f, 10.25f, 18.25f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 18.25f, 14.5f, 17.914f, 14.5f, 17.5f)
            curveTo(14.5f, 17.086f, 14.164f, 16.75f, 13.75f, 16.75f)
            horizontalLineTo(10.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DrawerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Drawer, contentDescription = null)
    }
}
