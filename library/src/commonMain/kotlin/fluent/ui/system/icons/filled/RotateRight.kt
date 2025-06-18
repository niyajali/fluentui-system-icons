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

public val FluentUi.Filled.RotateRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RotateRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 15f)
            curveTo(9.914f, 15f, 10.25f, 14.664f, 10.25f, 14.25f)
            curveTo(10.25f, 13.836f, 9.914f, 13.5f, 9.5f, 13.5f)
            horizontalLineTo(9f)
            curveTo(6.515f, 13.5f, 4.5f, 11.933f, 4.5f, 10f)
            curveTo(4.5f, 8.126f, 6.394f, 6.595f, 8.775f, 6.504f)
            lineTo(9f, 6.5f)
            horizontalLineTo(15.939f)
            lineTo(14.22f, 8.22f)
            curveTo(13.927f, 8.513f, 13.927f, 8.987f, 14.22f, 9.28f)
            curveTo(14.486f, 9.547f, 14.903f, 9.571f, 15.196f, 9.353f)
            lineTo(15.28f, 9.28f)
            lineTo(18.28f, 6.28f)
            curveTo(18.573f, 5.987f, 18.573f, 5.513f, 18.28f, 5.22f)
            lineTo(15.28f, 2.22f)
            lineTo(15.196f, 2.147f)
            curveTo(14.903f, 1.929f, 14.486f, 1.953f, 14.22f, 2.22f)
            curveTo(13.927f, 2.513f, 13.927f, 2.987f, 14.22f, 3.28f)
            lineTo(15.938f, 5f)
            horizontalLineTo(9f)
            curveTo(5.686f, 5f, 3f, 7.239f, 3f, 10f)
            curveTo(3f, 12.761f, 5.686f, 15f, 9f, 15f)
            horizontalLineTo(9.5f)
            close()
            moveTo(20.5f, 10.367f)
            curveTo(20.776f, 10.367f, 21f, 10.591f, 21f, 10.867f)
            verticalLineTo(20f)
            curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
            horizontalLineTo(3.862f)
            curveTo(3.683f, 21f, 3.518f, 20.905f, 3.429f, 20.75f)
            curveTo(3.29f, 20.511f, 3.372f, 20.206f, 3.611f, 20.067f)
            lineTo(20.249f, 10.434f)
            curveTo(20.326f, 10.39f, 20.412f, 10.367f, 20.5f, 10.367f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RotateRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RotateRight, contentDescription = null)
    }
}
