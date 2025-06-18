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

public val FluentUi.Filled.ShiftsDay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShiftsDay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(7.5f, 8.744f)
            curveTo(7.847f, 8.362f, 8.415f, 8f, 9.25f, 8f)
            curveTo(10.402f, 8f, 11.144f, 8.792f, 11.405f, 9.661f)
            curveTo(11.658f, 10.508f, 11.504f, 11.556f, 10.785f, 12.279f)
            curveTo(10.538f, 12.527f, 10.247f, 12.752f, 9.992f, 12.949f)
            lineTo(9.951f, 12.98f)
            curveTo(9.672f, 13.196f, 9.423f, 13.392f, 9.203f, 13.611f)
            curveTo(8.947f, 13.866f, 8.738f, 14.145f, 8.617f, 14.5f)
            horizontalLineTo(10.75f)
            curveTo(11.164f, 14.5f, 11.5f, 14.836f, 11.5f, 15.25f)
            curveTo(11.5f, 15.664f, 11.164f, 16f, 10.75f, 16f)
            horizontalLineTo(7.75f)
            curveTo(7.551f, 16f, 7.36f, 15.921f, 7.22f, 15.78f)
            curveTo(7.079f, 15.64f, 7f, 15.449f, 7f, 15.25f)
            curveTo(7f, 14.003f, 7.524f, 13.167f, 8.144f, 12.549f)
            curveTo(8.44f, 12.253f, 8.762f, 12.004f, 9.034f, 11.793f)
            lineTo(9.037f, 11.791f)
            curveTo(9.323f, 11.57f, 9.545f, 11.399f, 9.722f, 11.221f)
            curveTo(9.994f, 10.947f, 10.089f, 10.496f, 9.968f, 10.092f)
            curveTo(9.853f, 9.71f, 9.598f, 9.5f, 9.25f, 9.5f)
            curveTo(8.897f, 9.5f, 8.715f, 9.637f, 8.61f, 9.753f)
            curveTo(8.55f, 9.818f, 8.51f, 9.885f, 8.485f, 9.933f)
            curveTo(8.473f, 9.957f, 8.466f, 9.974f, 8.462f, 9.982f)
            lineTo(8.461f, 9.985f)
            curveTo(8.332f, 10.372f, 7.917f, 10.585f, 7.526f, 10.463f)
            curveTo(7.13f, 10.339f, 6.91f, 9.918f, 7.034f, 9.523f)
            lineTo(7.069f, 9.427f)
            curveTo(7.088f, 9.38f, 7.114f, 9.32f, 7.15f, 9.25f)
            curveTo(7.221f, 9.111f, 7.332f, 8.928f, 7.5f, 8.744f)
            close()
            moveTo(13.25f, 8f)
            curveTo(13.664f, 8f, 14f, 8.336f, 14f, 8.75f)
            verticalLineTo(11.499f)
            horizontalLineTo(15.5f)
            verticalLineTo(8.75f)
            curveTo(15.5f, 8.336f, 15.836f, 8f, 16.25f, 8f)
            curveTo(16.664f, 8f, 17f, 8.336f, 17f, 8.75f)
            verticalLineTo(15.22f)
            curveTo(17f, 15.635f, 16.664f, 15.97f, 16.25f, 15.97f)
            curveTo(15.836f, 15.97f, 15.5f, 15.635f, 15.5f, 15.22f)
            verticalLineTo(12.999f)
            horizontalLineTo(13.25f)
            curveTo(12.836f, 12.999f, 12.5f, 12.663f, 12.5f, 12.249f)
            verticalLineTo(8.75f)
            curveTo(12.5f, 8.336f, 12.836f, 8f, 13.25f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShiftsDayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShiftsDay, contentDescription = null)
    }
}
