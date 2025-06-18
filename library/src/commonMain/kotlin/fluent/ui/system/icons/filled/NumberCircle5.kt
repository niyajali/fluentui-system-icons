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

public val FluentIcons.Filled.NumberCircle5: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle5",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            close()
            moveTo(10.75f, 7f)
            curveTo(10.356f, 7f, 10.03f, 7.304f, 10.002f, 7.697f)
            lineTo(9.752f, 11.224f)
            curveTo(9.737f, 11.439f, 9.815f, 11.65f, 9.966f, 11.804f)
            curveTo(10.118f, 11.957f, 10.328f, 12.038f, 10.543f, 12.026f)
            lineTo(10.547f, 12.025f)
            lineTo(10.558f, 12.025f)
            lineTo(10.605f, 12.022f)
            curveTo(10.646f, 12.02f, 10.705f, 12.017f, 10.778f, 12.014f)
            curveTo(10.925f, 12.007f, 11.127f, 11.999f, 11.348f, 11.994f)
            curveTo(11.81f, 11.983f, 12.284f, 11.986f, 12.532f, 12.02f)
            curveTo(13.625f, 12.174f, 14.387f, 13.185f, 14.233f, 14.278f)
            curveTo(14.079f, 15.372f, 13.068f, 16.134f, 11.974f, 15.981f)
            curveTo(11.275f, 15.882f, 10.711f, 15.435f, 10.435f, 14.836f)
            curveTo(10.261f, 14.46f, 9.816f, 14.295f, 9.44f, 14.469f)
            curveTo(9.064f, 14.642f, 8.899f, 15.088f, 9.073f, 15.464f)
            curveTo(9.554f, 16.507f, 10.54f, 17.294f, 11.765f, 17.466f)
            curveTo(13.679f, 17.735f, 15.449f, 16.401f, 15.718f, 14.487f)
            curveTo(15.987f, 12.573f, 14.654f, 10.803f, 12.739f, 10.534f)
            lineTo(12.737f, 10.534f)
            curveTo(12.352f, 10.481f, 11.759f, 10.484f, 11.312f, 10.495f)
            lineTo(11.307f, 10.495f)
            lineTo(11.449f, 8.5f)
            horizontalLineTo(14.25f)
            curveTo(14.665f, 8.5f, 15f, 8.164f, 15f, 7.75f)
            curveTo(15f, 7.336f, 14.665f, 7f, 14.25f, 7f)
            horizontalLineTo(10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle5Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NumberCircle5, contentDescription = null)
    }
}
