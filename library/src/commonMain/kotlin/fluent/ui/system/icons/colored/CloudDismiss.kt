package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.CloudDismiss: ImageVector
    get() {
        if (_CloudDismiss != null) {
            return _CloudDismiss!!
        }
        _CloudDismiss = ImageVector.Builder(
            name = "Colored.CloudDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        1f to Color(0xFF367AF2)
                    ),
                    start = Offset(2.714f, 5.625f),
                    end = Offset(11.675f, 18.925f)
                )
            ) {
                moveTo(6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 14.985f, 19.985f, 17f, 17.5f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0x00FCFCFC)
                    ),
                    start = Offset(2f, 9.542f),
                    end = Offset(8.067f, 14.912f)
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(11f, 12.5f)
                curveTo(11f, 14.985f, 8.985f, 17f, 6.5f, 17f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.015f, 4.015f, 8f, 6.5f, 8f)
                curveTo(8.985f, 8f, 11f, 10.015f, 11f, 12.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0x00FCFCFC)
                    ),
                    start = Offset(8.146f, 3.675f),
                    end = Offset(9.739f, 11.946f)
                ),
                fillAlpha = 0.3f,
            ) {
                moveTo(12f, 15f)
                curveTo(15.314f, 15f, 18f, 12.314f, 18f, 9f)
                curveTo(18f, 5.686f, 15.314f, 3f, 12f, 3f)
                curveTo(9.021f, 3f, 6.548f, 5.172f, 6.08f, 8.019f)
                curveTo(6.218f, 8.007f, 6.359f, 8f, 6.5f, 8f)
                curveTo(8.986f, 8f, 11f, 10.015f, 11f, 12.5f)
                curveTo(11f, 13.332f, 10.775f, 14.111f, 10.381f, 14.779f)
                curveTo(10.896f, 14.923f, 11.439f, 15f, 12f, 15f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.412f to Color(0xFF2C87F5),
                        1f to Color(0x002C87F5)
                    ),
                    center = Offset(6.547f, 12.825f),
                    radius = 7.298f
                )
            ) {
                moveTo(12f, 15f)
                curveTo(15.314f, 15f, 18f, 12.314f, 18f, 9f)
                curveTo(18f, 5.686f, 15.314f, 3f, 12f, 3f)
                curveTo(9.021f, 3f, 6.548f, 5.172f, 6.08f, 8.019f)
                curveTo(6.218f, 8.007f, 6.359f, 8f, 6.5f, 8f)
                curveTo(8.986f, 8f, 11f, 10.015f, 11f, 12.5f)
                curveTo(11f, 13.332f, 10.775f, 14.111f, 10.381f, 14.779f)
                curveTo(10.896f, 14.923f, 11.439f, 15f, 12f, 15f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.5f to Color(0x00DD3CE2),
                        1f to Color(0xFFDD3CE2)
                    ),
                    center = Offset(11.167f, 2.125f),
                    radius = 17.321f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 14.985f, 19.985f, 17f, 17.5f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.288f to Color(0xFF0D1F69),
                        1f to Color(0x000D1F69)
                    ),
                    center = Offset(16.375f, 18.909f),
                    radius = 8.273f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 14.985f, 19.985f, 17f, 17.5f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF83F54),
                        1f to Color(0xFFCA2134)
                    ),
                    start = Offset(12.719f, 11.688f),
                    end = Offset(21.083f, 23.833f)
                )
            ) {
                moveTo(16.5f, 11f)
                curveTo(19.538f, 11f, 22f, 13.462f, 22f, 16.5f)
                curveTo(22f, 19.538f, 19.538f, 22f, 16.5f, 22f)
                curveTo(13.462f, 22f, 11f, 19.538f, 11f, 16.5f)
                curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFFECBE6)
                    ),
                    start = Offset(14.503f, 16.701f),
                    end = Offset(16.857f, 19.149f)
                )
            ) {
                moveTo(14.024f, 14.024f)
                curveTo(13.829f, 14.22f, 13.829f, 14.536f, 14.024f, 14.731f)
                lineTo(15.793f, 16.501f)
                lineTo(14.026f, 18.268f)
                curveTo(13.831f, 18.463f, 13.831f, 18.78f, 14.026f, 18.975f)
                curveTo(14.222f, 19.17f, 14.538f, 19.17f, 14.734f, 18.975f)
                lineTo(16.5f, 17.208f)
                lineTo(18.27f, 18.977f)
                curveTo(18.465f, 19.172f, 18.781f, 19.172f, 18.977f, 18.977f)
                curveTo(19.172f, 18.782f, 19.172f, 18.465f, 18.977f, 18.27f)
                lineTo(17.208f, 16.501f)
                lineTo(18.979f, 14.731f)
                curveTo(19.175f, 14.536f, 19.175f, 14.22f, 18.979f, 14.024f)
                curveTo(18.784f, 13.829f, 18.468f, 13.829f, 18.272f, 14.024f)
                lineTo(16.501f, 15.794f)
                lineTo(14.731f, 14.024f)
                curveTo(14.536f, 13.829f, 14.219f, 13.829f, 14.024f, 14.024f)
                close()
            }
        }.build()

        return _CloudDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDismiss: ImageVector? = null

@Preview
@Composable
private fun CloudDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.CloudDismiss, contentDescription = null)
    }
}
