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

public val FluentIcons.Filled.HeartBroken: ImageVector
    get() {
        if (_HeartBroken != null) {
            return _HeartBroken!!
        }
        _HeartBroken = ImageVector.Builder(
            name = "Filled.HeartBroken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.281f, 5.034f)
                lineTo(11.176f, 4.93f)
                curveTo(9.077f, 2.831f, 5.674f, 2.831f, 3.575f, 4.93f)
                curveTo(1.475f, 7.029f, 1.475f, 10.432f, 3.575f, 12.531f)
                lineTo(11.47f, 20.427f)
                curveTo(11.763f, 20.72f, 12.238f, 20.72f, 12.531f, 20.427f)
                lineTo(20.432f, 12.53f)
                curveTo(22.526f, 10.424f, 22.53f, 7.03f, 20.431f, 4.931f)
                curveTo(18.328f, 2.828f, 14.923f, 2.828f, 12.82f, 4.931f)
                lineTo(12.031f, 5.721f)
                lineTo(10.149f, 8.754f)
                lineTo(13.829f, 11.975f)
                curveTo(13.933f, 12.066f, 13.995f, 12.196f, 14f, 12.334f)
                curveTo(14.004f, 12.473f, 13.951f, 12.607f, 13.854f, 12.705f)
                lineTo(11.354f, 15.205f)
                curveTo(11.158f, 15.4f, 10.842f, 15.4f, 10.646f, 15.205f)
                curveTo(10.451f, 15.009f, 10.451f, 14.693f, 10.646f, 14.498f)
                lineTo(12.769f, 12.375f)
                lineTo(9.171f, 9.227f)
                curveTo(8.987f, 9.066f, 8.946f, 8.795f, 9.075f, 8.587f)
                lineTo(11.281f, 5.034f)
                close()
            }
        }.build()

        return _HeartBroken!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBroken: ImageVector? = null

@Preview
@Composable
private fun HeartBrokenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HeartBroken, contentDescription = null)
    }
}
