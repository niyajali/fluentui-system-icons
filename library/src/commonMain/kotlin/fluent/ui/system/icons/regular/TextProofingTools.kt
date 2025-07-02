/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextProofingTools icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, proofing, tools
 * - Source: ic_fluent_text_proofing_tools_24_regular.svg
 * 
 * @return The [ImageVector] for the TextProofingTools icon.
 */
public val FluentIcons.Regular.TextProofingTools: ImageVector
    get() {
        if (_textProofingTools != null) {
            return _textProofingTools!!
        }
        _textProofingTools = Builder(name = "TextProofingTools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.528f, 3.272f)
                curveTo(21.144f, 3.574f, 21.627f, 4.144f, 21.956f, 5.056f)
                curveTo(22.096f, 5.445f, 21.894f, 5.875f, 21.504f, 6.016f)
                curveTo(21.115f, 6.156f, 20.685f, 5.954f, 20.545f, 5.564f)
                curveTo(20.311f, 4.916f, 20.047f, 4.706f, 19.868f, 4.618f)
                curveTo(19.649f, 4.511f, 19.4f, 4.5f, 19.0f, 4.5f)
                curveTo(18.622f, 4.5f, 18.377f, 4.62f, 18.198f, 4.779f)
                curveTo(18.003f, 4.953f, 17.848f, 5.208f, 17.734f, 5.513f)
                curveTo(17.62f, 5.816f, 17.56f, 6.129f, 17.53f, 6.374f)
                curveTo(17.514f, 6.495f, 17.507f, 6.594f, 17.503f, 6.661f)
                curveTo(17.502f, 6.695f, 17.501f, 6.72f, 17.5f, 6.735f)
                lineTo(17.5f, 6.751f)
                curveTo(17.5f, 7.275f, 17.508f, 7.948f, 17.73f, 8.513f)
                curveTo(17.835f, 8.782f, 17.98f, 9.0f, 18.176f, 9.161f)
                curveTo(18.368f, 9.319f, 18.649f, 9.456f, 19.083f, 9.505f)
                curveTo(19.435f, 9.544f, 20.212f, 9.483f, 20.567f, 8.698f)
                curveTo(20.738f, 8.321f, 21.182f, 8.154f, 21.56f, 8.325f)
                curveTo(21.937f, 8.495f, 22.104f, 8.94f, 21.933f, 9.317f)
                curveTo(21.164f, 11.017f, 19.474f, 11.057f, 18.917f, 10.995f)
                curveTo(18.227f, 10.919f, 17.664f, 10.683f, 17.223f, 10.319f)
                curveTo(16.786f, 9.96f, 16.509f, 9.509f, 16.333f, 9.061f)
                curveTo(16.0f, 8.211f, 16.0f, 7.28f, 16.0f, 6.781f)
                lineTo(16.0f, 6.749f)
                lineTo(16.0f, 6.747f)
                lineTo(16.0f, 6.743f)
                lineTo(16.0f, 6.732f)
                lineTo(16.001f, 6.698f)
                curveTo(16.002f, 6.669f, 16.003f, 6.63f, 16.006f, 6.581f)
                curveTo(16.011f, 6.484f, 16.021f, 6.349f, 16.041f, 6.188f)
                curveTo(16.081f, 5.871f, 16.162f, 5.434f, 16.329f, 4.987f)
                curveTo(16.496f, 4.542f, 16.764f, 4.047f, 17.201f, 3.658f)
                curveTo(17.654f, 3.255f, 18.253f, 3.0f, 19.0f, 3.0f)
                lineTo(19.039f, 3.0f)
                curveTo(19.399f, 3.0f, 19.972f, 2.999f, 20.528f, 3.272f)
                close()
                moveTo(5.277f, 3.0f)
                curveTo(5.591f, 3.005f, 5.868f, 3.204f, 5.973f, 3.499f)
                lineTo(8.28f, 9.999f)
                curveTo(8.418f, 10.39f, 8.214f, 10.818f, 7.824f, 10.957f)
                curveTo(7.433f, 11.095f, 7.004f, 10.891f, 6.866f, 10.501f)
                lineTo(6.528f, 9.548f)
                lineTo(3.826f, 9.548f)
                lineTo(3.45f, 10.521f)
                curveTo(3.3f, 10.907f, 2.866f, 11.099f, 2.479f, 10.95f)
                curveTo(2.093f, 10.8f, 1.901f, 10.366f, 2.051f, 9.979f)
                lineTo(4.567f, 3.479f)
                curveTo(4.68f, 3.187f, 4.963f, 2.996f, 5.277f, 3.0f)
                close()
                moveTo(5.236f, 5.907f)
                lineTo(4.407f, 8.048f)
                lineTo(5.996f, 8.048f)
                lineTo(5.236f, 5.907f)
                close()
                moveTo(9.281f, 16.22f)
                lineTo(11.2f, 18.139f)
                lineTo(15.674f, 12.77f)
                curveTo(15.939f, 12.452f, 16.412f, 12.409f, 16.73f, 12.674f)
                curveTo(17.049f, 12.939f, 17.092f, 13.412f, 16.826f, 13.73f)
                lineTo(11.826f, 19.73f)
                curveTo(11.544f, 20.069f, 11.032f, 20.092f, 10.72f, 19.78f)
                lineTo(8.22f, 17.28f)
                curveTo(7.927f, 16.987f, 7.927f, 16.513f, 8.22f, 16.22f)
                curveTo(8.513f, 15.927f, 8.988f, 15.927f, 9.281f, 16.22f)
                close()
                moveTo(14.575f, 5.375f)
                curveTo(14.575f, 5.949f, 14.429f, 6.409f, 14.192f, 6.764f)
                curveTo(14.367f, 6.902f, 14.53f, 7.076f, 14.664f, 7.296f)
                curveTo(14.888f, 7.663f, 15.0f, 8.109f, 15.0f, 8.625f)
                curveTo(15.0f, 9.12f, 14.882f, 9.549f, 14.659f, 9.904f)
                curveTo(14.438f, 10.257f, 14.14f, 10.496f, 13.844f, 10.655f)
                curveTo(13.273f, 10.962f, 12.658f, 11.0f, 12.375f, 11.0f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 11.0f, 9.0f, 10.664f, 9.0f, 10.25f)
                verticalLineTo(3.75f)
                curveTo(9.0f, 3.336f, 9.336f, 3.0f, 9.75f, 3.0f)
                lineTo(9.759f, 3.0f)
                horizontalLineTo(12.163f)
                lineTo(12.182f, 3.0f)
                curveTo(12.398f, 3.0f, 12.979f, 2.999f, 13.516f, 3.298f)
                curveTo(13.809f, 3.462f, 14.086f, 3.713f, 14.284f, 4.079f)
                curveTo(14.479f, 4.44f, 14.575f, 4.874f, 14.575f, 5.375f)
                close()
                moveTo(12.163f, 4.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(12.163f)
                curveTo(12.313f, 6.25f, 12.568f, 6.221f, 12.761f, 6.103f)
                curveTo(12.847f, 6.051f, 12.916f, 5.985f, 12.968f, 5.891f)
                curveTo(13.021f, 5.797f, 13.075f, 5.639f, 13.075f, 5.375f)
                curveTo(13.075f, 5.064f, 13.016f, 4.888f, 12.964f, 4.792f)
                curveTo(12.915f, 4.701f, 12.854f, 4.647f, 12.784f, 4.608f)
                curveTo(12.611f, 4.511f, 12.381f, 4.5f, 12.163f, 4.5f)
                close()
                moveTo(12.375f, 9.5f)
                curveTo(12.562f, 9.5f, 12.884f, 9.468f, 13.133f, 9.334f)
                curveTo(13.247f, 9.273f, 13.33f, 9.199f, 13.388f, 9.107f)
                curveTo(13.443f, 9.019f, 13.5f, 8.873f, 13.5f, 8.625f)
                curveTo(13.5f, 8.329f, 13.437f, 8.165f, 13.383f, 8.076f)
                curveTo(13.329f, 7.988f, 13.256f, 7.925f, 13.156f, 7.875f)
                curveTo(12.922f, 7.76f, 12.622f, 7.75f, 12.375f, 7.75f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(12.375f)
                close()
            }
        }
        .build()
        return _textProofingTools!!
    }

@Suppress("ObjectPropertyName")
private var _textProofingTools: ImageVector? = null

@Preview
@Composable
private fun TextProofingToolsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextProofingTools, contentDescription = null)
    }
}

