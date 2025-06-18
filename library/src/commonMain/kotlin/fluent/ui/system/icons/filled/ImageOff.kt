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

public val FluentUi.Filled.ImageOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.483f, 4.544f)
            curveTo(3.177f, 5.04f, 3f, 5.624f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 18.376f, 3.177f, 18.96f, 3.483f, 19.456f)
            lineTo(10.409f, 12.53f)
            curveTo(10.595f, 12.344f, 10.805f, 12.198f, 11.03f, 12.091f)
            lineTo(12.52f, 13.58f)
            curveTo(12.226f, 13.298f, 11.759f, 13.302f, 11.47f, 13.591f)
            lineTo(4.544f, 20.517f)
            curveTo(5.04f, 20.823f, 5.624f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(18.376f, 21f, 18.96f, 20.823f, 19.456f, 20.517f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(21f, 17.75f)
            curveTo(21f, 17.773f, 21f, 17.795f, 20.999f, 17.818f)
            lineTo(6.183f, 3.001f)
            curveTo(6.205f, 3f, 6.227f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            close()
            moveTo(16.5f, 9.5f)
            curveTo(17.605f, 9.5f, 18.5f, 8.605f, 18.5f, 7.5f)
            curveTo(18.5f, 6.395f, 17.605f, 5.5f, 16.5f, 5.5f)
            curveTo(15.395f, 5.5f, 14.5f, 6.395f, 14.5f, 7.5f)
            curveTo(14.5f, 8.605f, 15.395f, 9.5f, 16.5f, 9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ImageOff, contentDescription = null)
    }
}
