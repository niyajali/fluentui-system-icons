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
package fluent.ui.system.icons.filled

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
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TextWordCount: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextWordCount",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6f)
            curveTo(2f, 5.448f, 2.448f, 5f, 3f, 5f)
            horizontalLineTo(21f)
            curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
            curveTo(22f, 6.552f, 21.552f, 7f, 21f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
            close()
            moveTo(18f, 18f)
            curveTo(18f, 17.448f, 18.448f, 17f, 19f, 17f)
            horizontalLineTo(21f)
            curveTo(21.552f, 17f, 22f, 17.448f, 22f, 18f)
            curveTo(22f, 18.552f, 21.552f, 19f, 21f, 19f)
            horizontalLineTo(19f)
            curveTo(18.448f, 19f, 18f, 18.552f, 18f, 18f)
            close()
            moveTo(14.035f, 17.128f)
            curveTo(13.966f, 17.192f, 13.921f, 17.284f, 13.903f, 17.352f)
            curveTo(13.759f, 17.885f, 13.209f, 18.201f, 12.676f, 18.056f)
            curveTo(12.143f, 17.912f, 11.828f, 17.363f, 11.972f, 16.83f)
            curveTo(12.062f, 16.498f, 12.264f, 16.044f, 12.673f, 15.663f)
            curveTo(13.104f, 15.263f, 13.705f, 15f, 14.469f, 15f)
            curveTo(16.08f, 15f, 17f, 16.25f, 17f, 17.364f)
            curveTo(17f, 17.747f, 16.934f, 18.38f, 16.534f, 18.948f)
            curveTo(16.566f, 18.988f, 16.596f, 19.03f, 16.626f, 19.073f)
            curveTo(16.874f, 19.441f, 17f, 19.879f, 17f, 20.364f)
            curveTo(17f, 21.196f, 16.732f, 21.903f, 16.187f, 22.389f)
            curveTo(15.663f, 22.855f, 15.015f, 23f, 14.469f, 23f)
            curveTo(13.978f, 23f, 13.437f, 22.914f, 12.956f, 22.593f)
            curveTo(12.462f, 22.263f, 12.159f, 21.77f, 11.983f, 21.207f)
            curveTo(11.818f, 20.68f, 12.113f, 20.119f, 12.64f, 19.955f)
            curveTo(13.167f, 19.79f, 13.728f, 20.084f, 13.892f, 20.611f)
            curveTo(13.972f, 20.866f, 14.051f, 20.919f, 14.067f, 20.93f)
            curveTo(14.097f, 20.95f, 14.194f, 21f, 14.469f, 21f)
            curveTo(14.688f, 21f, 14.806f, 20.941f, 14.856f, 20.895f)
            curveTo(14.885f, 20.87f, 15f, 20.759f, 15f, 20.364f)
            curveTo(15f, 20.238f, 14.972f, 20.198f, 14.969f, 20.193f)
            curveTo(14.969f, 20.193f, 14.969f, 20.193f, 14.969f, 20.193f)
            curveTo(14.962f, 20.183f, 14.939f, 20.154f, 14.866f, 20.118f)
            curveTo(14.694f, 20.033f, 14.433f, 20f, 14.214f, 20f)
            curveTo(13.661f, 20f, 13.214f, 19.552f, 13.214f, 19f)
            curveTo(13.214f, 18.448f, 13.661f, 18f, 14.214f, 18f)
            curveTo(14.494f, 18f, 14.657f, 17.954f, 14.746f, 17.914f)
            curveTo(14.828f, 17.878f, 14.868f, 17.838f, 14.893f, 17.805f)
            curveTo(14.957f, 17.72f, 15f, 17.566f, 15f, 17.364f)
            curveTo(15f, 17.33f, 14.978f, 17.235f, 14.896f, 17.149f)
            curveTo(14.832f, 17.083f, 14.711f, 17f, 14.469f, 17f)
            curveTo(14.193f, 17f, 14.083f, 17.083f, 14.035f, 17.128f)
            close()
            moveTo(7.813f, 17.636f)
            curveTo(7.813f, 17.477f, 7.878f, 17.301f, 7.992f, 17.171f)
            curveTo(8.099f, 17.049f, 8.217f, 17f, 8.331f, 17f)
            curveTo(8.561f, 17f, 8.733f, 17.113f, 8.812f, 17.241f)
            curveTo(8.869f, 17.333f, 8.953f, 17.556f, 8.723f, 17.968f)
            curveTo(8.618f, 18.157f, 8.453f, 18.337f, 8.201f, 18.547f)
            curveTo(8.076f, 18.652f, 7.939f, 18.755f, 7.785f, 18.871f)
            lineTo(7.721f, 18.918f)
            curveTo(7.588f, 19.017f, 7.441f, 19.127f, 7.298f, 19.24f)
            curveTo(6.613f, 19.784f, 5.813f, 20.586f, 5.813f, 22f)
            curveTo(5.813f, 22.552f, 6.26f, 23f, 6.813f, 23f)
            curveTo(6.815f, 23f, 6.817f, 23f, 6.82f, 23f)
            curveTo(6.822f, 23f, 6.825f, 23f, 6.827f, 23f)
            horizontalLineTo(9.832f)
            curveTo(10.384f, 23f, 10.832f, 22.552f, 10.832f, 22f)
            curveTo(10.832f, 21.448f, 10.384f, 21f, 9.832f, 21f)
            horizontalLineTo(8.311f)
            curveTo(8.38f, 20.938f, 8.457f, 20.873f, 8.542f, 20.806f)
            curveTo(8.658f, 20.714f, 8.777f, 20.625f, 8.911f, 20.525f)
            lineTo(8.98f, 20.474f)
            curveTo(9.137f, 20.357f, 9.311f, 20.226f, 9.482f, 20.084f)
            curveTo(9.823f, 19.799f, 10.196f, 19.434f, 10.471f, 18.941f)
            curveTo(11.001f, 17.989f, 11.004f, 16.985f, 10.514f, 16.191f)
            curveTo(10.047f, 15.432f, 9.206f, 15f, 8.331f, 15f)
            curveTo(6.777f, 15f, 5.813f, 16.393f, 5.813f, 17.636f)
            curveTo(5.813f, 18.189f, 6.26f, 18.636f, 6.813f, 18.636f)
            curveTo(7.365f, 18.636f, 7.813f, 18.189f, 7.813f, 17.636f)
            close()
            moveTo(2.552f, 19.016f)
            curveTo(2.102f, 19.314f, 1.494f, 19.201f, 1.182f, 18.757f)
            curveTo(0.864f, 18.305f, 0.973f, 17.682f, 1.425f, 17.364f)
            curveTo(2.035f, 16.935f, 2.478f, 16.25f, 2.572f, 15.797f)
            curveTo(2.676f, 15.296f, 3.138f, 14.961f, 3.635f, 15.003f)
            curveTo(4.148f, 15.046f, 4.552f, 15.476f, 4.552f, 16f)
            verticalLineTo(22f)
            curveTo(4.552f, 22.552f, 4.104f, 23f, 3.552f, 23f)
            curveTo(2.999f, 23f, 2.552f, 22.552f, 2.552f, 22f)
            verticalLineTo(19.016f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextWordCountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextWordCount, contentDescription = null)
    }
}
