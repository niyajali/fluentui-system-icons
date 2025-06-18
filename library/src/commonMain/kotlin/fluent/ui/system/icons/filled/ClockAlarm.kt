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

public val FluentUi.Filled.ClockAlarm: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockAlarm",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.103f, 3.476f)
            curveTo(8.371f, 2.576f, 7.253f, 2f, 6f, 2f)
            curveTo(3.791f, 2f, 2f, 3.791f, 2f, 6f)
            curveTo(2f, 7.253f, 2.576f, 8.371f, 3.476f, 9.103f)
            curveTo(3.167f, 10.012f, 3f, 10.987f, 3f, 12f)
            curveTo(3f, 14.215f, 3.8f, 16.244f, 5.128f, 17.812f)
            lineTo(3.22f, 19.72f)
            curveTo(2.927f, 20.013f, 2.927f, 20.487f, 3.22f, 20.78f)
            curveTo(3.513f, 21.073f, 3.987f, 21.073f, 4.28f, 20.78f)
            lineTo(6.188f, 18.872f)
            curveTo(7.756f, 20.2f, 9.785f, 21f, 12f, 21f)
            curveTo(14.215f, 21f, 16.244f, 20.2f, 17.812f, 18.872f)
            lineTo(19.72f, 20.78f)
            curveTo(20.013f, 21.073f, 20.487f, 21.073f, 20.78f, 20.78f)
            curveTo(21.073f, 20.487f, 21.073f, 20.013f, 20.78f, 19.72f)
            lineTo(18.872f, 17.812f)
            curveTo(20.2f, 16.244f, 21f, 14.215f, 21f, 12f)
            curveTo(21f, 10.987f, 20.833f, 10.012f, 20.524f, 9.103f)
            curveTo(21.424f, 8.371f, 22f, 7.253f, 22f, 6f)
            curveTo(22f, 3.791f, 20.209f, 2f, 18f, 2f)
            curveTo(16.747f, 2f, 15.629f, 2.576f, 14.897f, 3.476f)
            curveTo(13.988f, 3.167f, 13.013f, 3f, 12f, 3f)
            curveTo(10.987f, 3f, 10.012f, 3.167f, 9.103f, 3.476f)
            close()
            moveTo(6f, 3.5f)
            curveTo(6.631f, 3.5f, 7.208f, 3.734f, 7.648f, 4.12f)
            curveTo(6.166f, 4.94f, 4.94f, 6.166f, 4.12f, 7.648f)
            curveTo(3.734f, 7.208f, 3.5f, 6.631f, 3.5f, 6f)
            curveTo(3.5f, 4.619f, 4.619f, 3.5f, 6f, 3.5f)
            close()
            moveTo(16.352f, 4.12f)
            curveTo(16.792f, 3.734f, 17.369f, 3.5f, 18f, 3.5f)
            curveTo(19.381f, 3.5f, 20.5f, 4.619f, 20.5f, 6f)
            curveTo(20.5f, 6.631f, 20.267f, 7.208f, 19.88f, 7.648f)
            curveTo(19.06f, 6.166f, 17.834f, 4.94f, 16.352f, 4.12f)
            close()
            moveTo(11.25f, 7f)
            curveTo(11.664f, 7f, 12f, 7.336f, 12f, 7.75f)
            verticalLineTo(12f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 12f, 15.5f, 12.336f, 15.5f, 12.75f)
            curveTo(15.5f, 13.164f, 15.164f, 13.5f, 14.75f, 13.5f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 13.5f, 10.5f, 13.164f, 10.5f, 12.75f)
            verticalLineTo(7.75f)
            curveTo(10.5f, 7.336f, 10.836f, 7f, 11.25f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockAlarmPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClockAlarm, contentDescription = null)
    }
}
