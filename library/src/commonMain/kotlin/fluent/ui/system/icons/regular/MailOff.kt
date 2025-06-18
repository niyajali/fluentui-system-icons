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

public val FluentIcons.Regular.MailOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.47f, 4.53f)
            curveTo(2.585f, 5.111f, 2f, 6.112f, 2f, 7.25f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.644f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(17.439f, 18.5f)
            horizontalLineTo(5.25f)
            lineTo(5.106f, 18.494f)
            curveTo(4.207f, 18.421f, 3.5f, 17.668f, 3.5f, 16.75f)
            verticalLineTo(9.374f)
            lineTo(11.651f, 13.664f)
            lineTo(11.747f, 13.706f)
            curveTo(11.943f, 13.776f, 12.162f, 13.762f, 12.349f, 13.664f)
            lineTo(12.515f, 13.576f)
            lineTo(17.439f, 18.5f)
            close()
            moveTo(10.083f, 11.143f)
            lineTo(3.5f, 7.679f)
            verticalLineTo(7.25f)
            lineTo(3.506f, 7.106f)
            curveTo(3.56f, 6.442f, 3.985f, 5.882f, 4.574f, 5.635f)
            lineTo(10.083f, 11.143f)
            close()
            moveTo(20.5f, 7.678f)
            lineTo(14.184f, 11.003f)
            lineTo(15.295f, 12.113f)
            lineTo(20.5f, 9.373f)
            verticalLineTo(16.75f)
            lineTo(20.494f, 16.893f)
            curveTo(20.484f, 17.015f, 20.462f, 17.133f, 20.428f, 17.247f)
            lineTo(21.562f, 18.38f)
            curveTo(21.84f, 17.901f, 22f, 17.344f, 22f, 16.75f)
            verticalLineTo(7.25f)
            lineTo(21.995f, 7.066f)
            curveTo(21.899f, 5.356f, 20.483f, 4f, 18.75f, 4f)
            horizontalLineTo(7.182f)
            lineTo(8.682f, 5.5f)
            horizontalLineTo(18.75f)
            lineTo(18.893f, 5.506f)
            curveTo(19.793f, 5.579f, 20.5f, 6.332f, 20.5f, 7.25f)
            verticalLineTo(7.678f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailOff, contentDescription = null)
    }
}
