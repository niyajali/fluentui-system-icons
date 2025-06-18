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

public val FluentIcons.Filled.CheckmarkCircleWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkCircleWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 13.042f, 21.841f, 14.047f, 21.545f, 14.991f)
            lineTo(20.741f, 13.383f)
            curveTo(19.82f, 11.539f, 17.188f, 11.539f, 16.267f, 13.383f)
            lineTo(12.271f, 21.381f)
            curveTo(12.169f, 21.584f, 12.098f, 21.792f, 12.055f, 22f)
            lineTo(12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(15.22f, 8.97f)
            lineTo(10.75f, 13.439f)
            lineTo(8.78f, 11.47f)
            curveTo(8.487f, 11.177f, 8.013f, 11.177f, 7.72f, 11.47f)
            curveTo(7.427f, 11.763f, 7.427f, 12.237f, 7.72f, 12.53f)
            lineTo(10.22f, 15.03f)
            curveTo(10.513f, 15.323f, 10.987f, 15.323f, 11.28f, 15.03f)
            lineTo(16.28f, 10.03f)
            curveTo(16.573f, 9.737f, 16.573f, 9.263f, 16.28f, 8.97f)
            curveTo(15.987f, 8.677f, 15.513f, 8.677f, 15.22f, 8.97f)
            close()
            moveTo(17.161f, 13.83f)
            curveTo(17.714f, 12.723f, 19.294f, 12.723f, 19.847f, 13.83f)
            lineTo(23.844f, 21.828f)
            curveTo(24.342f, 22.826f, 23.617f, 24f, 22.501f, 24f)
            horizontalLineTo(14.507f)
            curveTo(13.391f, 24f, 12.665f, 22.826f, 13.164f, 21.828f)
            lineTo(17.161f, 13.83f)
            close()
            moveTo(19.004f, 16.496f)
            curveTo(19.004f, 16.219f, 18.78f, 15.995f, 18.504f, 15.995f)
            curveTo(18.228f, 15.995f, 18.003f, 16.219f, 18.003f, 16.496f)
            verticalLineTo(19.497f)
            curveTo(18.003f, 19.774f, 18.228f, 19.998f, 18.504f, 19.998f)
            curveTo(18.78f, 19.998f, 19.004f, 19.774f, 19.004f, 19.497f)
            verticalLineTo(16.496f)
            close()
            moveTo(18.504f, 21.999f)
            curveTo(18.78f, 21.999f, 19.004f, 21.775f, 19.004f, 21.499f)
            curveTo(19.004f, 21.222f, 18.78f, 20.998f, 18.504f, 20.998f)
            curveTo(18.228f, 20.998f, 18.003f, 21.222f, 18.003f, 21.499f)
            curveTo(18.003f, 21.775f, 18.228f, 21.999f, 18.504f, 21.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CheckmarkCircleWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CheckmarkCircleWarning, contentDescription = null)
    }
}
