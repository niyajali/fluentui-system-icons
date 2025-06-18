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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.PersonHome: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonHome",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.996f, 12.003f)
            curveTo(12.757f, 12.003f, 14.996f, 9.764f, 14.996f, 7.003f)
            curveTo(14.996f, 4.242f, 12.757f, 2.003f, 9.996f, 2.003f)
            curveTo(7.235f, 2.003f, 4.996f, 4.242f, 4.996f, 7.003f)
            curveTo(4.996f, 9.764f, 7.235f, 12.003f, 9.996f, 12.003f)
            close()
            moveTo(9.996f, 3.504f)
            curveTo(11.929f, 3.504f, 13.496f, 5.071f, 13.496f, 7.004f)
            curveTo(13.496f, 8.937f, 11.929f, 10.504f, 9.996f, 10.504f)
            curveTo(8.063f, 10.504f, 6.496f, 8.937f, 6.496f, 7.004f)
            curveTo(6.496f, 5.071f, 8.063f, 3.504f, 9.996f, 3.504f)
            close()
            moveTo(4.249f, 15.499f)
            horizontalLineTo(13.373f)
            lineTo(15.138f, 13.999f)
            horizontalLineTo(4.249f)
            curveTo(3.007f, 13.999f, 2f, 15.006f, 2f, 16.248f)
            verticalLineTo(16.826f)
            curveTo(2f, 17.719f, 2.319f, 18.582f, 2.898f, 19.261f)
            curveTo(4.464f, 21.095f, 6.85f, 22f, 9.996f, 22f)
            curveTo(10.704f, 22f, 11.369f, 21.947f, 12f, 21.855f)
            verticalLineTo(20.341f)
            curveTo(11.384f, 20.444f, 10.719f, 20.5f, 9.996f, 20.5f)
            curveTo(7.258f, 20.5f, 5.292f, 19.754f, 4.038f, 18.286f)
            curveTo(3.69f, 17.879f, 3.499f, 17.361f, 3.499f, 16.825f)
            verticalLineTo(16.247f)
            curveTo(3.499f, 15.833f, 3.834f, 15.498f, 4.248f, 15.498f)
            lineTo(4.249f, 15.499f)
            close()
            moveTo(16.771f, 13.923f)
            curveTo(17.191f, 13.566f, 17.808f, 13.566f, 18.228f, 13.923f)
            lineTo(21.603f, 16.792f)
            curveTo(21.854f, 17.006f, 21.999f, 17.319f, 21.999f, 17.649f)
            verticalLineTo(22.135f)
            curveTo(21.999f, 22.613f, 21.612f, 23f, 21.134f, 23f)
            horizontalLineTo(19.865f)
            curveTo(19.387f, 23f, 19f, 22.613f, 19f, 22.135f)
            verticalLineTo(19.693f)
            curveTo(19f, 19.312f, 18.692f, 19.002f, 18.311f, 19.001f)
            horizontalLineTo(16.69f)
            curveTo(16.309f, 19.003f, 16.001f, 19.312f, 16.001f, 19.693f)
            verticalLineTo(22.135f)
            curveTo(16.001f, 22.613f, 15.614f, 23f, 15.136f, 23f)
            horizontalLineTo(13.867f)
            curveTo(13.389f, 23f, 13.002f, 22.613f, 13.002f, 22.135f)
            verticalLineTo(17.649f)
            curveTo(13.002f, 17.319f, 13.147f, 17.006f, 13.398f, 16.792f)
            lineTo(16.773f, 13.923f)
            horizontalLineTo(16.771f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonHomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonHome, contentDescription = null)
    }
}
