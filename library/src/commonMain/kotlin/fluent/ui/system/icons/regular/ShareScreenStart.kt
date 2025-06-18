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

public val FluentUi.Regular.ShareScreenStart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenStart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 18.993f, 20.993f, 20f, 19.75f, 20f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(4.25f, 5.5f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.164f, 3.836f, 18.5f, 4.25f, 18.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 18.5f, 20.5f, 18.164f, 20.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(20.5f, 5.836f, 20.164f, 5.5f, 19.75f, 5.5f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12f, 7.245f)
            curveTo(12.199f, 7.245f, 12.39f, 7.324f, 12.53f, 7.465f)
            lineTo(15.785f, 10.72f)
            curveTo(16.078f, 11.013f, 16.078f, 11.487f, 15.785f, 11.78f)
            curveTo(15.492f, 12.073f, 15.017f, 12.073f, 14.724f, 11.78f)
            lineTo(12.75f, 9.806f)
            verticalLineTo(16.253f)
            curveTo(12.75f, 16.667f, 12.414f, 17.003f, 12f, 17.003f)
            curveTo(11.586f, 17.003f, 11.25f, 16.667f, 11.25f, 16.253f)
            verticalLineTo(9.808f)
            lineTo(9.281f, 11.78f)
            curveTo(8.988f, 12.073f, 8.513f, 12.073f, 8.22f, 11.781f)
            curveTo(7.927f, 11.488f, 7.927f, 11.013f, 8.219f, 10.72f)
            lineTo(11.469f, 7.466f)
            curveTo(11.61f, 7.325f, 11.801f, 7.246f, 12f, 7.245f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareScreenStartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShareScreenStart, contentDescription = null)
    }
}
