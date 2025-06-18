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

public val FluentUi.Regular.HomeDatabase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomeDatabase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.55f, 2.532f)
            curveTo(11.387f, 1.825f, 12.613f, 1.825f, 13.45f, 2.532f)
            lineTo(20.201f, 8.224f)
            curveTo(20.707f, 8.652f, 21f, 9.281f, 21f, 9.944f)
            verticalLineTo(11.441f)
            curveTo(20.579f, 11.307f, 20.127f, 11.201f, 19.655f, 11.127f)
            curveTo(19.604f, 11.118f, 19.552f, 11.111f, 19.5f, 11.103f)
            verticalLineTo(9.944f)
            curveTo(19.5f, 9.723f, 19.403f, 9.513f, 19.233f, 9.371f)
            lineTo(12.483f, 3.679f)
            curveTo(12.204f, 3.443f, 11.796f, 3.443f, 11.517f, 3.679f)
            lineTo(4.767f, 9.371f)
            curveTo(4.598f, 9.513f, 4.5f, 9.723f, 4.5f, 9.944f)
            lineTo(4.5f, 19.254f)
            curveTo(4.5f, 19.392f, 4.612f, 19.504f, 4.75f, 19.504f)
            horizontalLineTo(12f)
            verticalLineTo(20.5f)
            curveTo(12f, 20.674f, 12.02f, 20.843f, 12.056f, 21.004f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 21.004f, 3f, 20.22f, 3f, 19.254f)
            verticalLineTo(9.944f)
            curveTo(3f, 9.281f, 3.293f, 8.652f, 3.8f, 8.224f)
            lineTo(10.55f, 2.532f)
            close()
            moveTo(21f, 12.5f)
            curveTo(20.552f, 12.332f, 20.046f, 12.2f, 19.5f, 12.114f)
            curveTo(19.027f, 12.04f, 18.523f, 12f, 18f, 12f)
            curveTo(15.239f, 12f, 13f, 13.119f, 13f, 14.5f)
            curveTo(13f, 15.881f, 15.239f, 17f, 18f, 17f)
            curveTo(18.523f, 17f, 19.027f, 16.96f, 19.5f, 16.885f)
            curveTo(20.046f, 16.8f, 20.552f, 16.668f, 21f, 16.5f)
            curveTo(22.214f, 16.044f, 23f, 15.318f, 23f, 14.5f)
            curveTo(23f, 13.682f, 22.214f, 12.956f, 21f, 12.5f)
            close()
            moveTo(21f, 17.559f)
            curveTo(20.534f, 17.708f, 20.029f, 17.822f, 19.5f, 17.896f)
            curveTo(19.017f, 17.965f, 18.514f, 18f, 18f, 18f)
            curveTo(16.498f, 18f, 15.088f, 17.698f, 14.017f, 17.162f)
            curveTo(13.663f, 16.985f, 13.31f, 16.762f, 13f, 16.492f)
            verticalLineTo(20.5f)
            curveTo(13f, 20.856f, 13.148f, 21.194f, 13.416f, 21.5f)
            curveTo(14.188f, 22.383f, 15.95f, 23f, 18f, 23f)
            curveTo(20.761f, 23f, 23f, 21.881f, 23f, 20.5f)
            verticalLineTo(16.492f)
            curveTo(22.69f, 16.762f, 22.337f, 16.985f, 21.983f, 17.162f)
            curveTo(21.68f, 17.313f, 21.351f, 17.446f, 21f, 17.559f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HomeDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HomeDatabase, contentDescription = null)
    }
}
