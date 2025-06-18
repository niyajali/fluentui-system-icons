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

public val FluentUi.Filled.TableMoveAbove: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableMoveAbove",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.25f, 4.5f)
            curveTo(20.664f, 4.5f, 21f, 4.164f, 21f, 3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            curveTo(3f, 4.164f, 3.336f, 4.5f, 3.75f, 4.5f)
            lineTo(20.25f, 4.5f)
            close()
            moveTo(20.78f, 9.72f)
            curveTo(20.921f, 9.86f, 21f, 10.051f, 21f, 10.25f)
            verticalLineTo(14.5f)
            horizontalLineTo(16f)
            verticalLineTo(9.5f)
            horizontalLineTo(20.25f)
            curveTo(20.449f, 9.5f, 20.64f, 9.579f, 20.78f, 9.72f)
            close()
            moveTo(14.5f, 14.5f)
            verticalLineTo(10.482f)
            curveTo(14.251f, 10.518f, 13.994f, 10.5f, 13.75f, 10.427f)
            verticalLineTo(11.25f)
            curveTo(13.75f, 12.217f, 12.967f, 13f, 12f, 13f)
            curveTo(11.033f, 13f, 10.25f, 12.217f, 10.25f, 11.25f)
            verticalLineTo(10.427f)
            curveTo(10.006f, 10.5f, 9.749f, 10.518f, 9.5f, 10.482f)
            verticalLineTo(14.5f)
            lineTo(14.5f, 14.5f)
            close()
            moveTo(9.5f, 16f)
            lineTo(14.5f, 16f)
            verticalLineTo(21f)
            lineTo(9.5f, 21f)
            verticalLineTo(16f)
            close()
            moveTo(8f, 14.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 9.5f, 3f, 9.836f, 3f, 10.25f)
            verticalLineTo(14.5f)
            horizontalLineTo(8f)
            close()
            moveTo(3f, 16f)
            horizontalLineTo(8f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(16f)
            close()
            moveTo(16f, 16f)
            horizontalLineTo(21f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(16f)
            verticalLineTo(16f)
            close()
            moveTo(14.811f, 9.248f)
            curveTo(14.535f, 9.558f, 14.061f, 9.586f, 13.752f, 9.311f)
            lineTo(12.75f, 8.42f)
            verticalLineTo(11.25f)
            curveTo(12.75f, 11.664f, 12.414f, 12f, 12f, 12f)
            curveTo(11.586f, 12f, 11.25f, 11.664f, 11.25f, 11.25f)
            verticalLineTo(8.42f)
            lineTo(10.248f, 9.311f)
            curveTo(9.939f, 9.586f, 9.465f, 9.558f, 9.189f, 9.248f)
            curveTo(8.914f, 8.939f, 8.942f, 8.465f, 9.252f, 8.189f)
            lineTo(11.502f, 6.189f)
            curveTo(11.786f, 5.937f, 12.214f, 5.937f, 12.498f, 6.189f)
            lineTo(14.748f, 8.189f)
            curveTo(15.058f, 8.465f, 15.086f, 8.939f, 14.811f, 9.248f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableMoveAbovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableMoveAbove, contentDescription = null)
    }
}
