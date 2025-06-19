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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Share: ImageVector
    get() {
        if (_Share != null) {
            return _Share!!
        }
        _Share = ImageVector.Builder(
            name = "Regular.Share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.25f, 3f)
                curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
                curveTo(11f, 4.164f, 10.664f, 4.5f, 10.25f, 4.5f)
                horizontalLineTo(6.75f)
                curveTo(5.507f, 4.5f, 4.5f, 5.507f, 4.5f, 6.75f)
                verticalLineTo(17.25f)
                lineTo(4.512f, 17.48f)
                curveTo(4.627f, 18.615f, 5.585f, 19.5f, 6.75f, 19.5f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 19.5f, 19.5f, 18.493f, 19.5f, 17.25f)
                verticalLineTo(15.25f)
                curveTo(19.5f, 14.836f, 19.836f, 14.5f, 20.25f, 14.5f)
                curveTo(20.664f, 14.5f, 21f, 14.836f, 21f, 15.25f)
                verticalLineTo(17.25f)
                curveTo(21f, 19.321f, 19.321f, 21f, 17.25f, 21f)
                horizontalLineTo(6.75f)
                curveTo(4.744f, 21f, 3.105f, 19.424f, 3.005f, 17.443f)
                lineTo(3f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
                horizontalLineTo(10.25f)
                close()
                moveTo(14.936f, 2.068f)
                curveTo(15.203f, 1.946f, 15.516f, 1.99f, 15.738f, 2.181f)
                lineTo(22.738f, 8.181f)
                curveTo(22.899f, 8.318f, 22.994f, 8.517f, 23f, 8.728f)
                curveTo(23.006f, 8.939f, 22.922f, 9.143f, 22.77f, 9.29f)
                lineTo(15.77f, 16.04f)
                curveTo(15.554f, 16.249f, 15.234f, 16.308f, 14.957f, 16.19f)
                curveTo(14.68f, 16.073f, 14.5f, 15.801f, 14.5f, 15.5f)
                verticalLineTo(12.524f)
                curveTo(13.486f, 12.588f, 12.53f, 12.797f, 11.561f, 13.293f)
                curveTo(10.424f, 13.874f, 9.216f, 14.874f, 7.871f, 16.596f)
                lineTo(7.6f, 16.95f)
                curveTo(7.406f, 17.208f, 7.069f, 17.314f, 6.763f, 17.212f)
                curveTo(6.456f, 17.11f, 6.25f, 16.823f, 6.25f, 16.5f)
                curveTo(6.25f, 13.643f, 6.937f, 10.911f, 8.418f, 8.872f)
                curveTo(9.794f, 6.979f, 11.829f, 5.725f, 14.5f, 5.528f)
                verticalLineTo(2.75f)
                lineTo(14.508f, 2.641f)
                curveTo(14.544f, 2.393f, 14.704f, 2.175f, 14.936f, 2.068f)
                close()
                moveTo(16f, 6.25f)
                curveTo(16f, 6.664f, 15.664f, 7f, 15.25f, 7f)
                curveTo(12.693f, 7f, 10.855f, 8.07f, 9.632f, 9.753f)
                curveTo(8.754f, 10.961f, 8.178f, 12.51f, 7.915f, 14.246f)
                curveTo(8.915f, 13.198f, 9.892f, 12.461f, 10.877f, 11.957f)
                curveTo(12.36f, 11.198f, 13.801f, 11f, 15.25f, 11f)
                curveTo(15.449f, 11f, 15.64f, 11.079f, 15.78f, 11.22f)
                curveTo(15.921f, 11.36f, 16f, 11.551f, 16f, 11.75f)
                verticalLineTo(13.734f)
                lineTo(21.135f, 8.782f)
                lineTo(16f, 4.38f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _Share!!
    }

@Suppress("ObjectPropertyName")
private var _Share: ImageVector? = null

@Preview
@Composable
private fun SharePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Share, contentDescription = null)
    }
}
