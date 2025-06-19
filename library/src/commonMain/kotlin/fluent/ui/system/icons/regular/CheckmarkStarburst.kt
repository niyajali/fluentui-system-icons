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

public val FluentIcons.Regular.CheckmarkStarburst: ImageVector
    get() {
        if (_CheckmarkStarburst != null) {
            return _CheckmarkStarburst!!
        }
        _CheckmarkStarburst = ImageVector.Builder(
            name = "Regular.CheckmarkStarburst",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.836f, 2.034f)
                curveTo(9.948f, 2.072f, 10.058f, 2.118f, 10.165f, 2.17f)
                lineTo(11.448f, 2.802f)
                curveTo(11.796f, 2.973f, 12.204f, 2.973f, 12.552f, 2.802f)
                lineTo(13.835f, 2.17f)
                curveTo(15.197f, 1.499f, 16.846f, 2.06f, 17.517f, 3.423f)
                lineTo(17.59f, 3.585f)
                lineTo(17.653f, 3.752f)
                lineTo(18.113f, 5.105f)
                curveTo(18.238f, 5.473f, 18.527f, 5.761f, 18.894f, 5.886f)
                lineTo(20.248f, 6.347f)
                curveTo(21.686f, 6.836f, 22.455f, 8.398f, 21.966f, 9.836f)
                curveTo(21.927f, 9.948f, 21.882f, 10.058f, 21.829f, 10.165f)
                lineTo(21.198f, 11.448f)
                curveTo(21.026f, 11.796f, 21.026f, 12.204f, 21.198f, 12.552f)
                lineTo(21.829f, 13.835f)
                curveTo(22.5f, 15.197f, 21.939f, 16.846f, 20.577f, 17.517f)
                curveTo(20.47f, 17.569f, 20.36f, 17.615f, 20.248f, 17.653f)
                lineTo(18.894f, 18.113f)
                curveTo(18.527f, 18.238f, 18.238f, 18.527f, 18.113f, 18.894f)
                lineTo(17.653f, 20.248f)
                curveTo(17.164f, 21.686f, 15.602f, 22.455f, 14.164f, 21.966f)
                curveTo(14.051f, 21.927f, 13.941f, 21.882f, 13.835f, 21.829f)
                lineTo(12.552f, 21.198f)
                curveTo(12.204f, 21.026f, 11.796f, 21.026f, 11.448f, 21.198f)
                lineTo(10.165f, 21.829f)
                curveTo(8.802f, 22.5f, 7.154f, 21.939f, 6.483f, 20.577f)
                curveTo(6.431f, 20.47f, 6.385f, 20.36f, 6.347f, 20.248f)
                lineTo(5.886f, 18.894f)
                curveTo(5.761f, 18.527f, 5.473f, 18.238f, 5.105f, 18.113f)
                lineTo(3.752f, 17.653f)
                curveTo(2.314f, 17.164f, 1.545f, 15.602f, 2.034f, 14.164f)
                curveTo(2.072f, 14.051f, 2.118f, 13.941f, 2.17f, 13.835f)
                lineTo(2.802f, 12.552f)
                curveTo(2.973f, 12.204f, 2.973f, 11.796f, 2.802f, 11.448f)
                lineTo(2.17f, 10.165f)
                curveTo(1.499f, 8.802f, 2.06f, 7.154f, 3.423f, 6.483f)
                curveTo(3.529f, 6.431f, 3.639f, 6.385f, 3.752f, 6.347f)
                lineTo(5.105f, 5.886f)
                curveTo(5.473f, 5.761f, 5.761f, 5.473f, 5.886f, 5.105f)
                lineTo(6.347f, 3.752f)
                curveTo(6.836f, 2.314f, 8.398f, 1.545f, 9.836f, 2.034f)
                close()
                moveTo(7.767f, 4.235f)
                lineTo(7.306f, 5.589f)
                curveTo(7.031f, 6.397f, 6.397f, 7.031f, 5.589f, 7.306f)
                lineTo(4.235f, 7.767f)
                curveTo(4.184f, 7.784f, 4.134f, 7.805f, 4.085f, 7.829f)
                curveTo(3.466f, 8.134f, 3.211f, 8.883f, 3.516f, 9.502f)
                lineTo(4.148f, 10.785f)
                curveTo(4.525f, 11.551f, 4.525f, 12.449f, 4.148f, 13.215f)
                lineTo(3.516f, 14.497f)
                curveTo(3.492f, 14.546f, 3.471f, 14.596f, 3.454f, 14.647f)
                curveTo(3.232f, 15.3f, 3.581f, 16.01f, 4.235f, 16.233f)
                lineTo(5.589f, 16.693f)
                curveTo(6.397f, 16.968f, 7.031f, 17.603f, 7.306f, 18.411f)
                lineTo(7.767f, 19.765f)
                curveTo(7.784f, 19.816f, 7.805f, 19.866f, 7.829f, 19.914f)
                curveTo(8.134f, 20.534f, 8.883f, 20.788f, 9.502f, 20.484f)
                lineTo(10.785f, 19.852f)
                curveTo(11.551f, 19.475f, 12.449f, 19.475f, 13.215f, 19.852f)
                lineTo(14.497f, 20.484f)
                curveTo(14.546f, 20.507f, 14.596f, 20.528f, 14.647f, 20.545f)
                curveTo(15.3f, 20.768f, 16.01f, 20.418f, 16.233f, 19.765f)
                lineTo(16.693f, 18.411f)
                curveTo(16.968f, 17.603f, 17.603f, 16.968f, 18.411f, 16.693f)
                lineTo(19.765f, 16.233f)
                curveTo(19.816f, 16.215f, 19.866f, 16.195f, 19.914f, 16.171f)
                curveTo(20.534f, 15.866f, 20.788f, 15.117f, 20.484f, 14.497f)
                lineTo(19.852f, 13.215f)
                curveTo(19.475f, 12.449f, 19.475f, 11.551f, 19.852f, 10.785f)
                lineTo(20.484f, 9.502f)
                curveTo(20.507f, 9.454f, 20.528f, 9.404f, 20.545f, 9.353f)
                curveTo(20.768f, 8.699f, 20.418f, 7.989f, 19.765f, 7.767f)
                lineTo(18.411f, 7.306f)
                curveTo(17.603f, 7.031f, 16.968f, 6.397f, 16.693f, 5.589f)
                lineTo(16.233f, 4.235f)
                lineTo(16.204f, 4.159f)
                lineTo(16.171f, 4.085f)
                lineTo(16.109f, 3.974f)
                curveTo(15.773f, 3.436f, 15.078f, 3.23f, 14.497f, 3.516f)
                lineTo(13.215f, 4.148f)
                curveTo(12.449f, 4.525f, 11.551f, 4.525f, 10.785f, 4.148f)
                lineTo(9.502f, 3.516f)
                curveTo(9.454f, 3.492f, 9.404f, 3.471f, 9.353f, 3.454f)
                curveTo(8.699f, 3.232f, 7.989f, 3.581f, 7.767f, 4.235f)
                close()
                moveTo(10.05f, 14.389f)
                lineTo(15.469f, 8.969f)
                curveTo(15.762f, 8.677f, 16.237f, 8.677f, 16.53f, 8.969f)
                curveTo(16.796f, 9.236f, 16.821f, 9.652f, 16.603f, 9.946f)
                lineTo(16.53f, 10.03f)
                lineTo(10.53f, 16.03f)
                curveTo(10.244f, 16.316f, 9.79f, 16.32f, 9.499f, 16.058f)
                lineTo(9.424f, 15.98f)
                lineTo(6.924f, 12.98f)
                curveTo(6.658f, 12.662f, 6.701f, 12.189f, 7.02f, 11.924f)
                curveTo(7.309f, 11.683f, 7.726f, 11.696f, 7.999f, 11.94f)
                lineTo(8.076f, 12.02f)
                lineTo(10.05f, 14.389f)
                lineTo(15.469f, 8.969f)
                lineTo(10.05f, 14.389f)
                close()
            }
        }.build()

        return _CheckmarkStarburst!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkStarburst: ImageVector? = null

@Preview
@Composable
private fun CheckmarkStarburstPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CheckmarkStarburst, contentDescription = null)
    }
}
