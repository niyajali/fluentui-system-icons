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

public val FluentIcons.Regular.KeyReset: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyReset",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.999f, 8.25f)
            curveTo(17.69f, 8.25f, 18.249f, 7.69f, 18.249f, 7f)
            curveTo(18.249f, 6.309f, 17.69f, 5.75f, 16.999f, 5.75f)
            curveTo(16.309f, 5.75f, 15.749f, 6.309f, 15.749f, 7f)
            curveTo(15.749f, 7.69f, 16.309f, 8.25f, 16.999f, 8.25f)
            close()
            moveTo(8.949f, 8.6f)
            curveTo(8.949f, 4.986f, 11.885f, 2.05f, 15.499f, 2.05f)
            curveTo(19.096f, 2.05f, 22.049f, 4.869f, 22.049f, 8.5f)
            curveTo(22.049f, 9.939f, 21.584f, 11.271f, 20.795f, 12.352f)
            curveTo(20.647f, 12.232f, 20.493f, 12.118f, 20.333f, 12.011f)
            curveTo(20.073f, 11.837f, 19.801f, 11.685f, 19.519f, 11.554f)
            curveTo(20.165f, 10.706f, 20.549f, 9.647f, 20.549f, 8.5f)
            curveTo(20.549f, 5.731f, 18.302f, 3.55f, 15.499f, 3.55f)
            curveTo(12.713f, 3.55f, 10.449f, 5.814f, 10.449f, 8.6f)
            curveTo(10.449f, 8.862f, 10.483f, 9.139f, 10.537f, 9.445f)
            curveTo(10.635f, 10.002f, 10.469f, 10.59f, 10.051f, 11.009f)
            lineTo(3.815f, 17.244f)
            curveTo(3.581f, 17.479f, 3.449f, 17.797f, 3.449f, 18.128f)
            verticalLineTo(20.3f)
            curveTo(3.449f, 20.438f, 3.561f, 20.55f, 3.699f, 20.55f)
            horizontalLineTo(6.199f)
            curveTo(6.337f, 20.55f, 6.449f, 20.438f, 6.449f, 20.3f)
            verticalLineTo(18.8f)
            curveTo(6.449f, 18.109f, 7.009f, 17.55f, 7.699f, 17.55f)
            horizontalLineTo(9.449f)
            verticalLineTo(15.8f)
            curveTo(9.449f, 15.149f, 9.946f, 14.615f, 10.58f, 14.555f)
            lineTo(11.658f, 15.633f)
            curveTo(11.511f, 15.75f, 11.383f, 15.891f, 11.28f, 16.05f)
            horizontalLineTo(10.949f)
            verticalLineTo(17.8f)
            curveTo(10.949f, 18.49f, 10.39f, 19.05f, 9.699f, 19.05f)
            horizontalLineTo(7.949f)
            verticalLineTo(20.3f)
            curveTo(7.949f, 21.266f, 7.166f, 22.05f, 6.199f, 22.05f)
            horizontalLineTo(3.699f)
            curveTo(2.733f, 22.05f, 1.949f, 21.266f, 1.949f, 20.3f)
            verticalLineTo(18.128f)
            curveTo(1.949f, 17.399f, 2.239f, 16.699f, 2.755f, 16.184f)
            lineTo(8.99f, 9.948f)
            curveTo(9.045f, 9.893f, 9.077f, 9.805f, 9.06f, 9.704f)
            curveTo(8.999f, 9.36f, 8.949f, 8.987f, 8.949f, 8.6f)
            close()
            moveTo(13.78f, 11.28f)
            curveTo(14.073f, 10.987f, 14.073f, 10.513f, 13.78f, 10.22f)
            curveTo(13.487f, 9.927f, 13.013f, 9.927f, 12.72f, 10.22f)
            lineTo(10.72f, 12.22f)
            curveTo(10.427f, 12.513f, 10.427f, 12.987f, 10.72f, 13.28f)
            lineTo(12.72f, 15.28f)
            curveTo(13.013f, 15.573f, 13.487f, 15.573f, 13.78f, 15.28f)
            curveTo(14.073f, 14.987f, 14.073f, 14.513f, 13.78f, 14.22f)
            lineTo(13.061f, 13.5f)
            horizontalLineTo(17f)
            curveTo(17.692f, 13.5f, 18.369f, 13.705f, 18.944f, 14.09f)
            curveTo(19.52f, 14.474f, 19.969f, 15.021f, 20.234f, 15.661f)
            curveTo(20.499f, 16.3f, 20.568f, 17.004f, 20.433f, 17.683f)
            curveTo(20.298f, 18.362f, 19.964f, 18.985f, 19.475f, 19.475f)
            curveTo(18.985f, 19.964f, 18.362f, 20.298f, 17.683f, 20.433f)
            curveTo(17.004f, 20.568f, 16.3f, 20.499f, 15.661f, 20.234f)
            curveTo(15.021f, 19.969f, 14.474f, 19.52f, 14.09f, 18.944f)
            curveTo(13.705f, 18.369f, 13.5f, 17.692f, 13.5f, 17f)
            curveTo(13.5f, 16.586f, 13.164f, 16.25f, 12.75f, 16.25f)
            curveTo(12.336f, 16.25f, 12f, 16.586f, 12f, 17f)
            curveTo(12f, 17.989f, 12.293f, 18.956f, 12.843f, 19.778f)
            curveTo(13.392f, 20.6f, 14.173f, 21.241f, 15.087f, 21.619f)
            curveTo(16f, 21.998f, 17.006f, 22.097f, 17.976f, 21.904f)
            curveTo(18.945f, 21.711f, 19.836f, 21.235f, 20.535f, 20.535f)
            curveTo(21.235f, 19.836f, 21.711f, 18.945f, 21.904f, 17.976f)
            curveTo(22.097f, 17.006f, 21.998f, 16f, 21.619f, 15.087f)
            curveTo(21.241f, 14.173f, 20.6f, 13.392f, 19.778f, 12.843f)
            curveTo(18.956f, 12.293f, 17.989f, 12f, 17f, 12f)
            horizontalLineTo(13.061f)
            lineTo(13.78f, 11.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyResetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.KeyReset, contentDescription = null)
    }
}
