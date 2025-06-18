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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.EmojiAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EmojiAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 11.999f)
            curveTo(20.538f, 11.999f, 23f, 14.462f, 23f, 17.499f)
            curveTo(23f, 20.537f, 20.538f, 22.999f, 17.5f, 22.999f)
            curveTo(14.462f, 22.999f, 12f, 20.537f, 12f, 17.499f)
            curveTo(12f, 14.462f, 14.462f, 11.999f, 17.5f, 11.999f)
            close()
            moveTo(12f, 1.998f)
            curveTo(17.524f, 1.998f, 22.001f, 6.476f, 22.001f, 12f)
            curveTo(22.001f, 12.263f, 21.991f, 12.524f, 21.971f, 12.782f)
            curveTo(20.806f, 11.677f, 19.232f, 10.999f, 17.5f, 10.999f)
            curveTo(14.282f, 10.999f, 11.61f, 13.338f, 11.091f, 16.408f)
            curveTo(10.052f, 16.197f, 9.123f, 15.622f, 8.462f, 14.783f)
            curveTo(8.205f, 14.458f, 7.734f, 14.402f, 7.408f, 14.658f)
            curveTo(7.083f, 14.914f, 7.027f, 15.386f, 7.283f, 15.711f)
            curveTo(8.211f, 16.889f, 9.538f, 17.676f, 11.014f, 17.92f)
            curveTo(11.113f, 19.485f, 11.767f, 20.9f, 12.783f, 21.971f)
            curveTo(12.525f, 21.991f, 12.264f, 22.001f, 12f, 22.001f)
            curveTo(6.476f, 22.001f, 1.998f, 17.523f, 1.998f, 12f)
            curveTo(1.998f, 6.476f, 6.476f, 1.998f, 12f, 1.998f)
            close()
            moveTo(17.5f, 13.998f)
            lineTo(17.41f, 14.006f)
            curveTo(17.206f, 14.043f, 17.045f, 14.204f, 17.008f, 14.408f)
            lineTo(17f, 14.498f)
            lineTo(17f, 16.998f)
            lineTo(14.498f, 16.999f)
            lineTo(14.408f, 17.007f)
            curveTo(14.204f, 17.044f, 14.043f, 17.205f, 14.006f, 17.409f)
            lineTo(13.998f, 17.499f)
            lineTo(14.006f, 17.589f)
            curveTo(14.043f, 17.793f, 14.204f, 17.954f, 14.408f, 17.991f)
            lineTo(14.498f, 17.999f)
            lineTo(17.001f, 17.998f)
            lineTo(17.001f, 20.503f)
            lineTo(17.009f, 20.592f)
            curveTo(17.046f, 20.796f, 17.207f, 20.958f, 17.411f, 20.994f)
            lineTo(17.501f, 21.003f)
            lineTo(17.591f, 20.994f)
            curveTo(17.795f, 20.958f, 17.956f, 20.796f, 17.993f, 20.592f)
            lineTo(18.001f, 20.503f)
            lineTo(18.001f, 17.998f)
            lineTo(20.504f, 17.999f)
            lineTo(20.594f, 17.991f)
            curveTo(20.799f, 17.954f, 20.959f, 17.793f, 20.997f, 17.589f)
            lineTo(21.004f, 17.499f)
            lineTo(20.997f, 17.409f)
            curveTo(20.959f, 17.205f, 20.799f, 17.044f, 20.594f, 17.007f)
            lineTo(20.504f, 16.999f)
            lineTo(18f, 16.998f)
            lineTo(18f, 14.498f)
            lineTo(17.992f, 14.408f)
            curveTo(17.955f, 14.204f, 17.794f, 14.043f, 17.59f, 14.006f)
            lineTo(17.5f, 13.998f)
            close()
            moveTo(9f, 8.75f)
            curveTo(8.31f, 8.75f, 7.751f, 9.31f, 7.751f, 10f)
            curveTo(7.751f, 10.689f, 8.31f, 11.249f, 9f, 11.249f)
            curveTo(9.69f, 11.249f, 10.25f, 10.689f, 10.25f, 10f)
            curveTo(10.25f, 9.31f, 9.69f, 8.75f, 9f, 8.75f)
            close()
            moveTo(15f, 8.75f)
            curveTo(14.31f, 8.75f, 13.751f, 9.31f, 13.751f, 10f)
            curveTo(13.751f, 10.689f, 14.31f, 11.249f, 15f, 11.249f)
            curveTo(15.69f, 11.249f, 16.25f, 10.689f, 16.25f, 10f)
            curveTo(16.25f, 9.31f, 15.69f, 8.75f, 15f, 8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EmojiAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EmojiAdd, contentDescription = null)
    }
}
