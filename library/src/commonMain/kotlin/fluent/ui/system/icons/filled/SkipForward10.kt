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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.SkipForward10: ImageVector
    get() {
        if (_SkipForward10 != null) {
            return _SkipForward10!!
        }
        _SkipForward10 = ImageVector.Builder(
            name = "Filled.SkipForward10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 2.25f)
                curveTo(21.552f, 2.25f, 22f, 2.698f, 22f, 3.25f)
                verticalLineTo(9f)
                curveTo(22f, 9.552f, 21.552f, 10f, 21f, 10f)
                horizontalLineTo(15.75f)
                curveTo(15.198f, 10f, 14.75f, 9.552f, 14.75f, 9f)
                curveTo(14.75f, 8.448f, 15.198f, 8f, 15.75f, 8f)
                horizontalLineTo(19.137f)
                curveTo(18.153f, 6.821f, 16.929f, 5.887f, 15.455f, 5.43f)
                curveTo(13.44f, 4.807f, 11.312f, 4.861f, 9.349f, 5.591f)
                curveTo(7.368f, 6.328f, 5.538f, 7.822f, 4.627f, 9.484f)
                curveTo(4.361f, 9.969f, 3.754f, 10.146f, 3.269f, 9.88f)
                curveTo(2.785f, 9.615f, 2.608f, 9.007f, 2.873f, 8.523f)
                curveTo(4.048f, 6.38f, 6.288f, 4.596f, 8.652f, 3.716f)
                curveTo(11.033f, 2.83f, 13.615f, 2.768f, 16.046f, 3.52f)
                curveTo(17.622f, 4.008f, 18.932f, 4.899f, 20f, 5.979f)
                verticalLineTo(3.25f)
                curveTo(20f, 2.698f, 20.448f, 2.25f, 21f, 2.25f)
                close()
                moveTo(9.095f, 11.061f)
                curveTo(9.488f, 11.206f, 9.75f, 11.58f, 9.75f, 12f)
                verticalLineTo(20f)
                curveTo(9.75f, 20.552f, 9.303f, 21f, 8.75f, 21f)
                curveTo(8.198f, 21f, 7.75f, 20.552f, 7.75f, 20f)
                verticalLineTo(14.493f)
                curveTo(7.404f, 14.776f, 6.998f, 15.068f, 6.515f, 15.357f)
                curveTo(6.041f, 15.642f, 5.427f, 15.488f, 5.143f, 15.014f)
                curveTo(4.859f, 14.541f, 5.012f, 13.927f, 5.486f, 13.642f)
                curveTo(6.688f, 12.921f, 7.251f, 12.241f, 7.766f, 11.618f)
                curveTo(7.84f, 11.529f, 7.914f, 11.44f, 7.988f, 11.353f)
                curveTo(8.259f, 11.033f, 8.701f, 10.917f, 9.095f, 11.061f)
                close()
                moveTo(13.242f, 12.661f)
                curveTo(13.851f, 11.635f, 14.864f, 11f, 16.25f, 11f)
                curveTo(17.636f, 11f, 18.649f, 11.635f, 19.258f, 12.661f)
                curveTo(19.822f, 13.611f, 20f, 14.822f, 20f, 16f)
                curveTo(20f, 17.178f, 19.822f, 18.389f, 19.258f, 19.339f)
                curveTo(18.649f, 20.365f, 17.636f, 21f, 16.25f, 21f)
                curveTo(14.864f, 21f, 13.851f, 20.365f, 13.242f, 19.339f)
                curveTo(12.678f, 18.389f, 12.5f, 17.178f, 12.5f, 16f)
                curveTo(12.5f, 14.822f, 12.678f, 13.611f, 13.242f, 12.661f)
                close()
                moveTo(14.962f, 13.682f)
                curveTo(14.666f, 14.18f, 14.5f, 14.969f, 14.5f, 16f)
                curveTo(14.5f, 17.031f, 14.666f, 17.82f, 14.962f, 18.318f)
                curveTo(15.212f, 18.74f, 15.574f, 19f, 16.25f, 19f)
                curveTo(16.926f, 19f, 17.288f, 18.74f, 17.538f, 18.318f)
                curveTo(17.834f, 17.82f, 18f, 17.031f, 18f, 16f)
                curveTo(18f, 14.969f, 17.834f, 14.18f, 17.538f, 13.682f)
                curveTo(17.288f, 13.26f, 16.926f, 13f, 16.25f, 13f)
                curveTo(15.574f, 13f, 15.212f, 13.26f, 14.962f, 13.682f)
                close()
            }
        }.build()

        return _SkipForward10!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForward10: ImageVector? = null

@Preview
@Composable
private fun SkipForward10Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SkipForward10, contentDescription = null)
    }
}
