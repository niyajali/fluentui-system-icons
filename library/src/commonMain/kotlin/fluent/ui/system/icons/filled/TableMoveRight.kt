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

public val FluentUi.Filled.TableMoveRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableMoveRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            lineTo(8f, 8f)
            lineTo(8f, 3f)
            close()
            moveTo(8f, 9.5f)
            lineTo(3f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(8f)
            lineTo(8f, 9.5f)
            close()
            moveTo(9.5f, 14.5f)
            lineTo(9.5f, 9.5f)
            lineTo(13.518f, 9.5f)
            curveTo(13.482f, 9.749f, 13.5f, 10.006f, 13.573f, 10.25f)
            horizontalLineTo(12.75f)
            curveTo(11.783f, 10.25f, 11f, 11.033f, 11f, 12f)
            curveTo(11f, 12.967f, 11.783f, 13.75f, 12.75f, 13.75f)
            horizontalLineTo(13.573f)
            curveTo(13.5f, 13.994f, 13.482f, 14.251f, 13.518f, 14.5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(8f, 16f)
            horizontalLineTo(3f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            lineTo(8f, 16f)
            close()
            moveTo(9.5f, 21f)
            lineTo(9.5f, 16f)
            horizontalLineTo(14.5f)
            verticalLineTo(20.25f)
            curveTo(14.5f, 20.449f, 14.421f, 20.64f, 14.28f, 20.78f)
            curveTo(14.14f, 20.921f, 13.949f, 21f, 13.75f, 21f)
            horizontalLineTo(9.5f)
            close()
            moveTo(9.5f, 8f)
            lineTo(9.5f, 3f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3f, 14.5f, 3.336f, 14.5f, 3.75f)
            verticalLineTo(8f)
            lineTo(9.5f, 8f)
            close()
            moveTo(19.5f, 20.25f)
            curveTo(19.5f, 20.664f, 19.836f, 21f, 20.25f, 21f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            lineTo(21f, 3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            curveTo(19.836f, 3f, 19.5f, 3.336f, 19.5f, 3.75f)
            lineTo(19.5f, 20.25f)
            close()
            moveTo(14.752f, 14.811f)
            curveTo(14.442f, 14.535f, 14.414f, 14.061f, 14.689f, 13.752f)
            lineTo(15.58f, 12.75f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 12.75f, 12f, 12.414f, 12f, 12f)
            curveTo(12f, 11.586f, 12.336f, 11.25f, 12.75f, 11.25f)
            horizontalLineTo(15.58f)
            lineTo(14.689f, 10.248f)
            curveTo(14.414f, 9.939f, 14.442f, 9.465f, 14.752f, 9.189f)
            curveTo(15.061f, 8.914f, 15.535f, 8.942f, 15.811f, 9.252f)
            lineTo(17.811f, 11.502f)
            curveTo(18.063f, 11.786f, 18.063f, 12.214f, 17.811f, 12.498f)
            lineTo(15.811f, 14.748f)
            curveTo(15.535f, 15.058f, 15.061f, 15.086f, 14.752f, 14.811f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableMoveRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableMoveRight, contentDescription = null)
    }
}
